package hello.algorithm;

import java.util.List;

public class fibonacci {
    public static void main(String[] args) {
        int fib = fib(10);
        System.out.println("fib = " + fib);
        List<Integer> fibList = List.of(1, 2);
        
    }
    public static int fib(int n){
        int fib = 0;
        if (n==0)
            return 0;
        else if(n==1)
            return 1;
        else{
            fib = fib(n-1) + fib(n-2);
            return fib;
        }
    }
}
