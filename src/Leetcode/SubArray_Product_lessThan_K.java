package Leetcode;

public class SubArray_Product_lessThan_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        //base case
        if(k==0){
            return 0;
        }
        int count = 0;
        int product = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (i <= j && product >= k) {
                product /= nums[i++];
            }
            count += j - i + 1;
        }
        return count;
        
        
        //Same Approach, using while loop
        /*
        if(k==0){
            return 0;
        }
        int n = nums.length;
        int count = 0;
        int left = 0;
        int right = 0;
        int product = 1;
        
        while(right<n){
            product*=nums[right];
            while(left<=right && product>=k){
                product /= nums[left++];
            }
            count+=right-left+1;
            right++;
        }
        return count;
        */
    }
}
