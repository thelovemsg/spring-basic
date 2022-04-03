package designpattern.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        //global 하게 하나의 instance를 공유해서 사용할 것임.
//        SingletonObject so = new SingletonObject(); <= 오류남. private 설정이 되어있어 생성 불가
       /* SingletonObject instance1 = SingletonObject.getInstance();

        SingletonObject instance2 = null;
        Constructor<?>[] declaredConstructors = SingletonObject.class.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            instance2 = (SingletonObject) constructor.newInstance("INSTANCE");
        }

        System.out.println(instance1 == instance2);*/

        /*
        SingletonObject so = SingletonObject.getInstance();
        SingletonObject so1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
            out.writeObject(so);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            so1 = (SingletonObject) in.readObject();
        }

        System.out.println(so == so1);
        */

        SingletonEnum s1 = SingletonEnum.INSTANCE;

        SingletonEnum s2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))){
            out.writeObject(s1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            s2 = (SingletonEnum) in.readObject();
        }

        System.out.println(s1 == s2);
    }
}
