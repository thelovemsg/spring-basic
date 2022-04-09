package me.whiteship.collection.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.stream.Stream;

public class stack01 {

    public static void main(String[] args) { //declare and initialize a stack object 
         Stack stack = new Stack(); 
         stack.push("bangal");
         stack.push("joshe");
         stack.push("shane");
         System.out.println("Stack elements using Java 8 forEach:");
         //get a stream for the stack 
         Stream stream = stack.stream(); 
         //traverse though each stream object using forEach construct of Java 8 
         stream.forEach((element) -> {
             System.out.print(element + " ");
             // print element 
         });
         System.out.println(" Stack elements using Java 8 forEachRemaining:"); 
         //define an iterator for the stack
         Iterator stackIterator = stack.iterator();
         //use forEachRemaining construct to print each stack element
         stackIterator.forEachRemaining(val -> { System.out.print(val + " "); });

        System.out.println("\n===============================\n");
        //declare a stack object 
         Stack stack1 = new Stack(); 
         //print initial stack 
         System.out.println("Initial stack : " + stack);
         //isEmpty ()
         System.out.println("Is stack Empty? : " + stack.isEmpty());
         //push () operation
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         //print non-empty stack
         System.out.println("Stack after push operation: " + stack);
         //pop () operation
         System.out.println("Element popped out:" + stack.pop());
         System.out.println("Stack after Pop Operation : " + stack);
         //search () operation
         System.out.println("Element 10 found at position: " + stack.search(10));
         System.out.println("Is Stack empty? : " + stack.isEmpty());

        System.out.println("===========================");
        Stack <Integer> stk = new Stack<>();
        stk.push(119);
        stk.push(203);
        stk.push(988);
        ListIterator<Integer> ListIterator = stk.listIterator(stk.size());
        System.out.println("Iteration over the Stack from top to bottom:");
        while (ListIterator.hasPrevious())
        {
            Integer avg = ListIterator.previous();
            System.out.println(avg);
        }
    }
}
