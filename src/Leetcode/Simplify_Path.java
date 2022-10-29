package Leetcode;

import java.util.Stack;

public class Simplify_Path {
    public String simplifyPath(String path) {
        Stack<String> s= new Stack<>();
        StringBuilder ans = new StringBuilder();
        String[] np = path.split("/");
        
        for(int i=0;i<np.length;i++){
            if(!s.isEmpty() && np[i].equals("..")) s.pop();
            if(!np[i].equals("") && !np[i].equals("..") && !np[i].equals(".")){
                s.push(np[i]);
            }
        }
        //is stack is empty
        if(s.isEmpty()) return "/";
        
        while(!s.isEmpty()){
            ans.insert(0, s.pop()).insert(0, "/");
        }
        return ans.toString();
    }
}
