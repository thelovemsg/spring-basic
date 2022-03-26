package com.example.generic;

import java.util.ArrayList;

class Family {
    public String toString(){
        return "Family";
    }
}

class Father extends Family {
    public String toString(){
        return "Father";
    }
}

class Son extends Family {
    public String toString() {
        return "Son";
    }
}

public class TestGeneric2 {
    public static void main(String[] args) {
        FamilyBox<Father> fatherFamilyBox = new FamilyBox<Father>();
        FamilyBox<Son> sonFamilyBox = new FamilyBox<Son>();


        fatherFamilyBox.add(new Father());
        sonFamilyBox.add(new Son());

        System.out.println(DoMovePlan.letGoMoveOut(fatherFamilyBox));
        System.out.println(DoMovePlan.letGoMoveOut(sonFamilyBox));
    }
}

class MovePlan{
    String plan;
    MovePlan(String plan){
        this.plan = plan;
    }
    public String toString(){
        return plan;
    }
}

class DoMovePlan{
    static MovePlan letGoMoveOut(FamilyBox<? extends Family> box){
        String test = "";

        for(Family member : box.getList()){
            test +=member + " ";
        }
        return new MovePlan(test);
    }
}

class FamilyBox<T extends Family> extends Person<T> { }

class Person<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }

    ArrayList<T> getList(){
        return list;
    }
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}
