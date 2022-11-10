package Leetcode;

public class Valid_perfect_Square {
    public boolean isPerfectSquare(int num) {
        //using binary search, two pointers, T.C : O(logn)
        //base case
        if(num<1) return false;
        long left = 1;
        long right = num;
        
        while(left<=right){
            long mid = left+(right-left)/2;
            long t = mid*mid;
            
            //case 1
            if(t>num){
                right = mid-1;
            }
            else if(t<num){
                left = mid+1;
            }
            else return true;
        }
        return false;
    }
}
