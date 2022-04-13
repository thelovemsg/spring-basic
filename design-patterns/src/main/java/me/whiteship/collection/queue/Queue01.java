package me.whiteship.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
        queue1.add(1);     // queue에 값 1 추가
        queue1.add(2);     // queue에 값 2 추가
        queue1.offer(3);   // queue에 값 3 추가
        System.out.println("queue1 = " + queue1);

        Integer pollInteger = queue1.poll();// queue에 첫번째 값을 반환하고 제거 비어있다면 null
        System.out.println("pollInteger = " + pollInteger);
        Integer removedData = queue1.remove();// queue에 첫번째 값 제거
        System.out.println("removedData = " + removedData);
        System.out.println("queue1 = " + queue1);
        System.out.println(" ============================ " );
        queue1.clear();      // queue 초기화
        System.out.println("queue1 = " + queue1);
    }
}
