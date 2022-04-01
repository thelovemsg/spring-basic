package realBasic.core.autowired;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CustomAnnotation { }

@CustomAnnotation
class TestParentClass{

//    @CustomAnnotation
    String test1;

    @CustomAnnotation
    static class ChildClass extends TestParentClass{

    }
}