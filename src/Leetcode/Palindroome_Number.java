package Leetcode;

public class Palindroome_Number {
    public boolean isPalindrome(int x) {
        //Approach1
        String num = Integer.toString(x);
        int left=0;
        int right = num.length()-1;
        if(num.length()==1) return true;
        while(left<right){
            if(num.charAt(left)!=num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
        /*
        //Approach2
        
        int original = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x= x/10;
        }
        return rev==original ? true : false;
        */
    }
}
