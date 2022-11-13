package Leetcode;

public class Minimum_moves_to_equal_arrayElements {
    public int minMoves(int[] nums) {
        /*Approach, T.C : O(n), we just find the minimum element in the array and 
        just find the difference between each element of the array and the minimun element*/
        
        //find minimun in the array
        int min = nums[0];
        //first loop, T.C : O(n)
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        int count = 0;
        //second loop T.C :O(n)
        for(int i=0;i<nums.length;i++){
            count+=nums[i]-min;
        }
        return count;
    }
}
