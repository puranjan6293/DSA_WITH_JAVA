package Leetcode;

public class Longest_valid_parenthesis {
    /*
     The idea is simple, we only update the result (max) when we find a "pair".
     If we find a pair. We throw this pair away and see how big the gap is 
     between current and previous invalid.
     EX: "( )( )"
     stack: -1, 0,
     when we get to index 1 ")", the peek is "(" so we pop it out and see what's before "(".
     In this example it's -1. So the gap is "current_index" - (-1) = 2.

     The idea only update the result (max) when we find a "pair" and 
     push -1 to stack first covered all edge cases.
     */
    public int longestValidParentheses(String s) {
        /*
        //Approach1, using stack, T.C : O(n), S.C : O(n)
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(-1);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && stack.size()>1 && s.charAt(stack.peek())=='('){
                stack.pop();
                ans = Math.max(ans, i-stack.peek());
            }
            else stack.push(i);
        }
        return ans;
        */
        
        //Approach2, using twopointers T.C O(n), S.C : O(1)
        int open=0;
        int close=0;
        int maxLen=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='(') open++;
            else close++;
            
            if(open==close){
                maxLen=Math.max(maxLen,open+close);
            }
            else if(close>open){
                open=close=0;
            }
        }
        
        open=close=0;
        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            
            if(c=='(') open++;
            else close++;
            
            if(open==close){
                maxLen=Math.max(maxLen,open+close);
            }
            else if(close<open){
                open=close=0;
            }
        }
        return maxLen;
    }
}
