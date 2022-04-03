package designpattern.designpattern.singleton;

import java.io.Serializable;

public class SingletonObject implements Serializable {

    //역직렬화시 이것을 넣으면 동일성 보장
    protected Object readResolve() {
        return getInstance();
    }

    // 방법4. static inner 클래스 사용하기
    private SingletonObject(){}

    private static class SingletonObjectHolder {
        private static final SingletonObject INSTANCE = new SingletonObject();
    }

    public static SingletonObject getInstance(){
        return SingletonObjectHolder.INSTANCE;
    }

    /*
    방법 3. double checked locking으로 효율적인 동기화 블럭 만들기
    private static volatile SingletonObject instance;

    public static synchronized SingletonObject getInstance(){
        if (instance == null){
            synchronized (SingletonObject.class){
                if (instance == null){
                    instance = new SingletonObject();
                }
            }
        }
        return instance;
    }
    */

    //방법 2. 이른 초기화 : eager initialization
//    private static final SingletonObject INSTANCE = new SingletonObject();

//    private SingletonObject(){}
//
//    public static SingletonObject getInstance(){
//        return INSTANCE;
//    }

    //외부에서 인스턴스를 생성 못하게 private 설정

    /*방법 1. 동기화하기
    private static SingletonObject instance = null;
    문제점. getInstance()할 때 마다 동기화 작업이 이루어짐 => 성눙 저하
    public static synchronized SingletonObject getInstance() {

        //맨 처음 인스턴스가 없으면 새로 생성해서 static 변수로 할당
        if(instance == null){
            instance = new SingletonObject();
        }
        //존재하면
        return instance;
    }
    */

}
