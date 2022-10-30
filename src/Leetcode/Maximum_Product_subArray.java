package Leetcode;

public class Maximum_Product_subArray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int left = 1;
        int right = 1;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            ////if any of left or right become 0 then update it to 1
            if(left==0) left = 1;
            if(right==0) right = 1;
            /*
            //we can write like this also
            left = left==0 ? 1 : left;
            right = right==0 ? 1 : right;
            */
            
            //prefix product
            left*=nums[i];
            
            //suffix product
            right*=nums[n-1-i];
            
            //ans
            max = Math.max(max,Math.max(left,right));
        }
        return max;
    }
}
