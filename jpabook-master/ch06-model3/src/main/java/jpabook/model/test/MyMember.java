package jpabook.model.test;

import javax.persistence.Entity;

@Entity
public class MyMember extends BaseEntity{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
