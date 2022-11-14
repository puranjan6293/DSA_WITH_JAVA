package Leetcode;
import java.util.*;
public class Decode_String {
    public String decodeString(String s) {
        //Approach, using two stacks
        Stack<Integer> freq = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                count = count*10+(c-'0');
            }
            else if(Character.isLetter(c)){
                sb.append(c);
            }
            else if(c=='['){
                freq.push(count);
                count = 0;
                
                str.push(sb);
                sb = new StringBuilder();
            }
            else if(c==']'){
                StringBuilder temp = sb;
                sb = str.pop();
                
                int n = freq.pop();
                
                while(n-->0) sb.append(temp);
            }
        }
        return sb.toString();
    }
}
