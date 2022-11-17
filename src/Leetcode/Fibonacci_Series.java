package Leetcode;

public class Fibonacci_Series {
    public int fib(int n) {
        /*
        //recursive approach, T.C : O(2^n), S.C : O(n)
        //base case
        if(n<=1){
            return n;
        }
        
        else return fib(n-1)+fib(n-2);
        */
        //Iterative approach, T.C : O(n), S.C : O(1)
        //base case
        if(n<=1){
            return n;
        }
        int a = 0;
        int b = 1;
        while(n-->1){
            int sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}
