package Leetcode;
import java.util.*;
public class Stack_Operations {
    /*
    //Approach1
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        s2.push(val);
        if(s1.isEmpty() || val<=s1.peek()){
            s1.push(val);
        }
    }
    
    public void pop() {
        int val = s2.pop();
        if(val==s1.peek()){
            s1.pop();
        }
    }
    
    public int top() {
        return s2.peek();
    }
    
    public int getMin() {
        return s1.peek();
    }
    */
    //Approach2
    Stack<Integer> stack=new Stack<>();
    int min=Integer.MAX_VALUE;
    public void push(int x) {
        if(x<=min) {stack.push(min); min=x;}
        stack.push(x);
    }
    public void pop() {
        if(stack.peek()==min){ stack.pop(); min=stack.pop(); }
        else stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return min;
    }
}
