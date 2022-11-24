package jpabook.model.test.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(MemberProductId.class)
public class MemberProduct {

    @Id
    @ManyToOne
    @JoinColumn(name = "PMEMBER_ID")
    private PMember PMember;

    @Id
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    public PMember getPMember(){
        return this.PMember;
    }

    private int orderAmount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

}