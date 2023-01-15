package tobyspring.vol2.part01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InfraBeanTest {

    @Test
    @DisplayName("tobyspring vol2 - 193 page ")
    public void test1() {
        ApplicationContext context = new GenericXmlApplicationContext(BeanRoleTest.class, "beanrole.xml");
    }

}
