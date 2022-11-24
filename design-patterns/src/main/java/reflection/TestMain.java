package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {

    public static void main(String[] args) {
        try {
            //클래스 이름 출력
            System.out.println("클래스 이름 출력\n");
            Class clazz = SecondTarget.class;
            System.out.println("클래스 이름 출력 : " + clazz.getName());

            //이름으로 찾기
            System.out.println("이름으로 찾기\n");
            Class<?> clazz2 = Class.forName("reflection.SecondTarget");
            System.out.println("이름만 알고 있다 : " + clazz2.getName());

            //생성자 찾기
            System.out.println("생성자 찾기n\n");
            Class<?> clazz3 = Class.forName("reflection.FirstTarget");
            Constructor<?> dc = clazz3.getDeclaredConstructor();
            System.out.println("생성자 찾기 : " + dc.getName());

            //생성자 찾기 - 여러개
            System.out.println("생성자 찾기 - 여러개\n");
            Class<?> clazz4 = Class.forName("reflection.FirstTarget");
            Constructor<?>[] dc1 = clazz3.getDeclaredConstructors();
            for (Constructor<?> constructor : dc1) {
                System.out.println("생성자 찾기 - 여러개 : " + constructor);
            }

            //메소드 찾기 - 인자 있는 경우
            System.out.println("메소드 찾기 - 인자 있는 경우\n");
            Class clazz5 = Class.forName("reflection.SecondTarget");
            Method method1 = clazz5.getDeclaredMethod("method4", int.class);
            System.out.println("Find out method4 method in SecondTarget: " + method1);

            //메소드 찾기 - 인자 없는 경우
            System.out.println("메소드 찾기 - 인자 없는 경우\n");
            Class clazz6 = Class.forName("reflection.FirstTarget");
            Method method2 = clazz6.getDeclaredMethod("method1", null);
            System.out.println("Find out method1 method in FirstTarget: " + method2);

            //메소드 찾기 - 인자 여러개
            System.out.println("메소드 찾기 - 인자 여러개\n");
            Class clazz7 = Class.forName("reflection.SecondTarget");
            Class partypes[] = new Class[1];
            partypes[0]=int.class;
            Method method3 = clazz7.getDeclaredMethod("method4", partypes);
            System.out.println("Find out method1 method in SecondTarget: " + method3);

            //모든 메소드 찾기 - 상속받은 것은 안찾음
            System.out.println("모든 메소드 찾기 - 상속받은 것은 안찾음\n");
            Class clazz8 = Class.forName("reflection.SecondTarget");
            Method methods2[] = clazz8.getDeclaredMethods();
            for (Method method : methods2) {
                System.out.println("method = " + method);
            }

            //모든 메소드 찾기 - 상속받은 것도 찾음
            System.out.println("모든 메소드 찾기 - 상속받은 것도 찾음\n");
            Class clazz9 = Class.forName("reflection.SecondTarget");
            Method methods3[] = clazz9.getMethods();
            for (Method method : methods3) {
                System.out.println("method = " + method);
            }

            //필드 변수로 찾기
            System.out.println("필드 변수 찾기\n");
            Class clazz10 = Class.forName("reflection.FirstTarget");
            Field field = clazz10.getDeclaredField("str1");
            System.out.println(field);

            //모든 필드 변수로 찾기
            System.out.println("모든 필드 변수 찾기\n");
            Class clazz11 = Class.forName("reflection.FirstTarget");
            Field[] fields = clazz10.getDeclaredFields();
            for (Field field1 : fields) {
                System.out.println("field1 = " + field1);
            }

            //메소드 호출하기
            System.out.println("메소드 호출하기\n");
            SecondTarget secondTarget = new SecondTarget();
            Class<?> clazz12 = Class.forName("reflection.SecondTarget");
            Method method = clazz12.getDeclaredMethod("method4", int.class);
            int returnValue = (int) method.invoke(secondTarget, 10);
            System.out.println("return value of SecondTarget method4 : " + returnValue);

            //private 한 메소드 접근하기
            System.out.println("private 한 메소드 접근하기\n");
            SecondTarget secondTarget1 = new SecondTarget();
            Class<?> clazz13 = Class.forName("reflection.FirstTarget");
            Method method11 = clazz13.getDeclaredMethod("method1");
            method11.setAccessible(true);
            method11.invoke(secondTarget1);

            //Field 출력
            System.out.println("Field 출력\n");
            SecondTarget secondTarget2 = new SecondTarget();
            Class<?> clazz14 = Class.forName("reflection.SecondTarget");
            Field fld = clazz14.getField("target1");
            //Returns the value of the field represented by this Field,
            // on the specified object.
            // The value is automatically wrapped in an object
            // if it has a primitive type.
            System.out.println(fld.get(secondTarget2));

            fld.set(secondTarget2,"str2");
            System.out.println("fld = " + fld.get(secondTarget2));

            SecondTarget secondTarget3 = new SecondTarget();
            Class<?> clazz15 = Class.forName("reflection.SecondTarget");
            Field fld2 = clazz15.getDeclaredField("target2");
            fld2.setAccessible(true);
            fld2.set(secondTarget3, "123456");
            System.out.println(fld2.get(secondTarget3));

            //static 메소드 호출과 필드 변경
            System.out.println("static 메소드 호출\n");
            Class<?> clazz16 = Class.forName("reflection.StaticEx");
            Method method4 = clazz16.getDeclaredMethod("getSquare", int.class);
            method4.invoke(null, 10);

            System.out.println("static 필드 호출\n");
            Class<?> clazz17 = Class.forName("reflection.StaticEx");
            Field fld3 = clazz17.getDeclaredField("EXAMPLE");
            fld3.set(null, "Hello, world!");
            System.out.println("StaticExample.EXAMPLE : " + fld3.get(null));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

