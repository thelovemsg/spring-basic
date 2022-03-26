package com.example.generic;

public class TestGeneric3 {

    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.getT();

        Box<String> box2 = Util.boxing("암묵적 호출");
        String stringValue = box2.getT();

        System.out.println("intValue = " + intValue);
        System.out.println("stringValue = " + stringValue);
    }

}

class Box<T>{
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t){
        this.t = t;
    }
}

class Util{
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    }
}