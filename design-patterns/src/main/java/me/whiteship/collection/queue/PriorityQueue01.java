package me.whiteship.collection.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {

    public static void main(String[] args) {
        // Integer 타입으로 우선순위 큐 선언(낮은 숫자 순으로 우선순위 결정)
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();

        // Integer 타입으로 우선순위 큐 선언(높은 숫자 순으로 우선순위 결정)
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

        // Integer 타입으로 우선순위 큐 선언(낮은 숫자 순으로 우선순위 결정)
        PriorityQueue<String> priorityQueue3 = new PriorityQueue<>();

        // Integer 타입으로 우선순위 큐 선언(높은 숫자 순으로 우선순위 결정)
        PriorityQueue<String> priorityQueue4 = new PriorityQueue<>(Collections.reverseOrder());
        //출처 : https://crazykim2.tistory.com/575

        Queue priorityQueue01 = new PriorityQueue<>();
        priorityQueue01.add(1);
        priorityQueue01.add(10);
        priorityQueue01.add(8);

        System.out.println("priorityQueue01 = " + priorityQueue01);

        priorityQueue01.add(2);
        priorityQueue01.add(9);
        priorityQueue01.add(15);
        System.out.println("priorityQueue01 = " + priorityQueue01);

        priorityQueue01.add(7);
        System.out.println("priorityQueue01 = " + priorityQueue01);

        Object poll1 = priorityQueue01.poll();
        System.out.println("poll1 = " + poll1);

        System.out.println("priorityQueue01 = " + priorityQueue01);

    }

}
