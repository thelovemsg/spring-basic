package tobyspring.vol2.part01.infrabean;

import javax.annotation.PostConstruct;

public class Hello {
    @PostConstruct
    public void init() {
        System.out.println("Init");
    }

    public void sayHello(){
        System.out.println("Hello boy~");
    }
}
