package jpabook.model.test.entity;

import java.io.Serializable;
import java.util.Objects;

public class MemberProductId implements Serializable {

    private String pmember;
    private String product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberProductId that = (MemberProductId) o;
        return Objects.equals(pmember, that.pmember) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pmember, product);
    }
}
