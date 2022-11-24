package jpabook.model.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id
    @Column(name = "TEAM_ID")
    private String id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<MyMember> myMembers = new ArrayList<MyMember>();

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addMyMember(MyMember member){
        this.myMembers.add(member);
        if(member.getTeam() != this)
            member.setTeam(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyMember> getMyMembers() {
        return myMembers;
    }

    public void setMembers(List<MyMember> myMembers) {
        this.myMembers = myMembers;
    }
}
