package Leetcode;

public class Sum_Of_Square_numbers {
    public boolean judgeSquareSum(int c) {
        //Base case
        if(c<3) return true;
        //two pointers
        long left = 0;
        long right = (long)Math.sqrt(c);
        
        while(left<=right){
            //finding a^2+b^2
            long sum = left*left+right*right;
            
            //if a^2+b^2=c
            if(sum==c) return true;
            //if a^2+b^2<c
            else if(sum<c) left++;
            //if a^2+b^2>c
            else right--;
        }
        return false;
    }
}
