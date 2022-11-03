package Leetcode;

public class Rotate_Array_in_k {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1); //rotating array in [7,6,5,4,3,2,1].
        reverse(nums, 0, k-1);  //rotating array in [5,6,7,4,3,2,1].
        reverse(nums, k, nums.length-1); //rotating array in [5,6,7,1,2,3,4].
    }
    static void reverse(int[] nums, int left, int right){
        // while loop for checking the indexes.
        while(left<right){
             // simple swapping between array elements.
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
    }
}
