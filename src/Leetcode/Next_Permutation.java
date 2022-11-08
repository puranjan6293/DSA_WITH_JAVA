package Leetcode;

public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        //T.C : O(n)
        //Approach: find the two elements we have to swap , then reverse the rest right half
        //base case
        if(nums==null || nums.length<=1) return;
        //the first break point may at the second last index
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        //if we get the break point
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            //swap between the two elements
            swap(nums, i, j);
        }
        //simply reverse the right half
        reverse(nums, i+1, nums.length-1);
    }
    //swap method
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //reverse method
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i++,j--);
        }
    }
}
