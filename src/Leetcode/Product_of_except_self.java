package Leetcode;

public class Product_of_except_self {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] output = new int[len];
    
        //approach, using two for loop, T.C : O(n)
        int leftMult = 1, rightMult = 1;
    
        for(int i = len-1; i >= 0; i--){
            output[i] = rightMult;
            rightMult *= nums[i];
        }
        for(int j = 0; j < len; j++){
            output[j] *= leftMult;
            leftMult *= nums[j];
       
        }
    
        return output;
    }
}
