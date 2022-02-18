package hateoas.hateoastest;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@JsonFilter("MemberFilter")
public class Member {

    private String name;
    private String password;

    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
