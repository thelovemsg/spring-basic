package tobyspring.vol2.part01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

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
}
