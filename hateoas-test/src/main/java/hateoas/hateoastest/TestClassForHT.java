package hateoas.hateoastest;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
public class TestClassForHT {
    Map<Long, Member> memberMap = new HashMap<>();

    @PostConstruct
    public void init() {
        System.out.println("testClassForHT.settingDummy");
        for(int i = 0; i < 10; i++){
            memberMap.put(Long.valueOf(i), new Member("member" + i, "123456"));
        }
    }

    @GetMapping("/users/{id}")
    public EntityModel<Member> testingMember(@PathVariable Long id){

        Member member = memberMap.get(id);

        EntityModel<Member> model = EntityModel.of(member);
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllMembers());
        model.add(linkTo.withRel("all-members"));

        return model;
    }

    @GetMapping("/users")
    public MappingJacksonValue retrieveAllMembers(){
        List<Member> users = new LinkedList<>();
        for(Long id : memberMap.keySet()){
            Member member = memberMap.get(id);
            users.add(member);
        }
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("password");

        FilterProvider filters = new SimpleFilterProvider().addFilter("MemberFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(users);
        mapping.setFilters(filters);
        return mapping;
    }
}
