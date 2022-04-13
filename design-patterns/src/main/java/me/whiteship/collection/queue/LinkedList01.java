package me.whiteship.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();//타입 미설정 Object로 선언
        LinkedList<Student> members = new LinkedList<Student>();//타입설정

        members.addFirst(new Student("john",10));
        members.addFirst(new Student("kim",11));
        members.add(1, new Student("one position john", 50));
        members.addLast(new Student("last john", 15));

        members.stream().forEach(member -> {
            System.out.println(member.getName());
            System.out.println(member.getAge());
            System.out.println("=====");
        });

        members.remove(1);

        //순회방법 1 : Iterator 사용하기
        Iterator<Student> iterator = members.iterator();//Iterator 선언
        while(iterator.hasNext()){//다음값이 있는지 체크
            System.out.println(iterator.next()); //값 출력
        }

        //순회방법 1 : stream 사용하기
        members.stream().forEach(member -> {
            System.out.println(member.getName());
            System.out.println(member.getAge());
            System.out.println("=====");
        });

        System.out.println(members.size());
    }

    static class Student{
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }



    }

}


