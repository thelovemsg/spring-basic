package jpabook.model.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class PMember {

    @Id @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    @OneToMany(mappedBy = "PMember")
    private List<MemberProduct> memberProducts;

    public void setMemberProducts(List<MemberProduct> memberProducts) {
        this.memberProducts = memberProducts;
    }

    public List<MemberProduct> getMemberProducts() {
        return memberProducts;
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
}
