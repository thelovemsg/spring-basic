package tobyspring.vol2.part01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BeanTest {
    String basePath = StringUtils.cleanPath(ClassUtils.classPackageAsResourcePath(getClass())) + "/";

    @Test
    public void BeanTest01() throws Exception{
        //given
        StaticApplicationContext ac = new StaticApplicationContext();
        ac.registerPrototype("hello1", Hello.class);
        Hello hello1 = ac.getBean("hello1", Hello.class);

        //when

        //then

        assertThat(hello1).isNotNull();

        RootBeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        /*
         * 빈에 DI되는 프로퍼티는 스트링이나 숫자 등의 값과 다른 빈 오브젝트를 가리키는 레퍼런스로 분류할 수 있다.
         * 레퍼런스로 지정된 프로퍼티는 다른 빈 오브젝트를 주입해서 오브젝트 사이의 관계를 만들어내는데 사용된다.
         * */

        helloDef.getPropertyValues().addPropertyValue("name", "Spring");
        ac.registerBeanDefinition("hello2", helloDef);

        Hello helloDef2 = ac.getBean("hello2", Hello.class);
        assertThat(helloDef2.sayHello()).isEqualTo("Hello Spring");

        assertThat(ac.getBeanFactory().getBeanDefinitionCount()).isEqualTo(2);

    }

    @Test
    public void registerBeanWithDependency() throws Exception{
        //given
        StaticApplicationContext ac = new StaticApplicationContext();
        //when
        //메타정보를 RootBeanDefinition을 이용해서 정의
        ac.registerBeanDefinition("printer", new RootBeanDefinition(StringPrinter.class));
        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name", "Spring");
        helloDef.getPropertyValues().addPropertyValue("printer", new RuntimeBeanReference("printer"));

        ac.registerBeanDefinition("hello", helloDef);
        Hello hello = ac.getBean("hello", Hello.class);
        hello.print();

        assertThat(ac.getBean("printer").toString()).isEqualTo("Hello Spring");


        //then
    }

    @Test
    public void genericApplicationContext() throws Exception{
        //given
        GenericApplicationContext ac = new GenericApplicationContext();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(ac);
        reader.loadBeanDefinitions("applicationContext.xml");

        // XmlBeanDefinitionReader를 직접 만들지 않고 두개의 클래스가 하나로 뭉쳐진 GenericXmlApplicationContext를 사용해도 좋다.
        //GenericApplicationContext ac1 = new GenericXmlApplicationContext("applicationContext.xml");
        ac.refresh();

        //when
        Hello hello = ac.getBean("hello", Hello.class);
        hello.print();

        //then
        assertThat(ac.getBean("printer").toString()).isEqualTo("Hello Spring");

    }

    @Test
    public void ChildAndParentTest() throws Exception{
        //given
        //parentContext.xml => 부모 컨텍스트가 없는 루트 컨텍스트.
        //반드시 스스로 완전한 빈 의존관계를 보장받아야 한다.
        ClassPathResource classPathResource = new ClassPathResource("parentContext.xml");
        ApplicationContext parent = new GenericXmlApplicationContext(classPathResource.getPath());
        GenericApplicationContext child = new GenericApplicationContext(parent);

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(child);
        reader.loadBeanDefinitions("childContext.xml");
        child.refresh();

        //when
        Printer printer = child.getBean("printer", Printer.class);
        assertThat(printer).isNotNull();

        //then

        Hello hello = child.getBean("hello", Hello.class);
        assertThat(hello).isNotNull();

        hello.print();
        assertThat(printer.toString()).isEqualTo("Hello Child");
    }

    @Test
    @DisplayName("싱글톤 테스트")
    public void singletonScope() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(
                SingletonBean.class, SingletonClientBean.class
        );

        Set<SingletonBean> beans = new HashSet<>();

        beans.add(ac.getBean(SingletonBean.class));
        beans.add(ac.getBean(SingletonBean.class));
        assertThat(beans.size()).isEqualTo(1);

        beans.add(ac.getBean(SingletonClientBean.class).bean1);
        beans.add(ac.getBean(SingletonClientBean.class).bean2);
        assertThat(beans.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("prototype 으로 bean 생성")
    public void prototypeScope() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SingletonBean.class, SingletonClientBean.class);

        Set<PrototypeBean> bean = new HashSet<PrototypeBean>();

        bean.add(ac.getBean(PrototypeBean.class));
        assertThat(bean.size()).isEqualTo(1);

        bean.add(ac.getBean(PrototypeBean.class));
        assertThat(bean.size()).isEqualTo(2);

        bean.add(ac.getBean(PrototypeClientBean.class).bean1);
        assertThat(bean.size()).isEqualTo(3);

        bean.add(ac.getBean(PrototypeClientBean.class).bean2);
        assertThat(bean.size()).isEqualTo(4);
    }
    
    static class SingletonBean {};
    static class SingletonClientBean {
        @Autowired SingletonBean bean1;
        @Autowired SingletonBean bean2;
    }

    @Scope("prototype")
    static class PrototypeBean{}
    static class PrototypeClientBean{
        @Autowired PrototypeBean bean1;
        @Autowired PrototypeBean bean2;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int count = Integer.MIN_VALUE;
        for(int i=0; i<points.length-1; i++){
            int result = 1;
            for(int j=1; j< points.length-2; j++){
                Float slope1 = (float) (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
                Float slope2 = (float) (points[j+1][1] - points[i][1]) / (points[j+1][0] - points[i][0]);
                System.out.println("slope1 :: " + slope1);
                System.out.println("slope2 :: " + slope2);

                if (Float.floatToIntBits(slope1) == Float.floatToIntBits(slope2))
                    result+=2;
            }
            System.out.println("===================");
            count = Math.max(result, count);
        }
        System.out.println(count);

    }
}
