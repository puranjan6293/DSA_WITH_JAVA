package Leetcode;
public class stack_implimentation_using_queue {
    /*
    //Approach1
    private Queue<Integer> q = new LinkedList<>();
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
     */
    /*
    //Approach2
    ArrayDeque<Integer> q;
    public MyStack() {
        q=new ArrayDeque<>();        
    }
    public void push(int x) {
        q.push(x);        
    }
    
    public int pop() {
        return q.remove();
    }
    public int top() {
        return q.peekFirst();
    }
    public boolean empty() {
        return q.isEmpty(); 
    }
    */
}
