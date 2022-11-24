package jpabook.model.test.entity;

import javax.persistence.*;

@Entity
public class MyMember {

    @Id
    @Column(name="MEMBER_ID")
    private String id;
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public MyMember(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public void setTeam(Team team){
        if(this.team != null){
            this.team.getMyMembers().remove(this);
        }
        this.team = team;
        if(!team.getMyMembers().contains(this)){
            team.getMyMembers().add(this);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }
}
