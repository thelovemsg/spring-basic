//package com.example.generic;
//
//import java.util.ArrayList;
//
//
//class Family implements GoFishing {
//    public String toString(){
//        return "Family";
//    }
//}
//
//interface GoFishing {}
//
//class Mother extends Father{
//    public String toString(){
//        return "Mother";
//    }
//}
//
//class Father extends Family {
//    public String toString(){
//        return "Father";
//    }
//}
//class Boy {
//    public String toString(){
//        return "Boy";
//    }
//}
//
//class Son extends Family {
//    public String toString(){
//        return "Son";
//    }
//}
//
//public class TestGeneric1 {
//    public static void main(String[] args) {
//        FamilyBox<Family> familyBox = new FamilyBox<Family>();
//        FamilyBox<Mother> motherBox = new FamilyBox<Mother>();
////        FamilyBox<Family> fatherBox = new FamilyBox<Son>(); 타입 불일치 에러
////        FamilyBox<Boy> boyBox = new FamilyBox<Boy>();
//    }
//
//
//}
//
//class FamilyBox<T extends Family & GoFishing> extends Person<T> {
//
//}
//
//class Person<T> {
//    ArrayList<T> list = new ArrayList<T>();
//
//    void add(T item){
//        list.add(item);
//    }
//    T get(int i){
//        return list.get(i);
//    }
//
//    ArrayList<T> getList(){
//        return list;
//    }
//    int size(){
//        return list.size();
//    }
//    public String toString(){
//        return list.toString();
//    }
//
//}
