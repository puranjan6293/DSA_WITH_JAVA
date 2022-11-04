package Leetcode;

import java.util.Arrays;

public class lambda_Functions {
    public static void main(String[] args) {
        String[] conv = {"1", "3", "5", "2"};

        //Here -> is a lambda operator.
        //Arrays.sort(conv,(a,b) -> (b+a).compareTo(a+b)). it used for 'sort descending'
        Arrays.sort(conv,(a,b) -> (b+a).compareTo(a+b));
        for(String e:conv){
            System.out.print(e+" ");
        }
        //OutPut is 5 3 2 1
    }
}
