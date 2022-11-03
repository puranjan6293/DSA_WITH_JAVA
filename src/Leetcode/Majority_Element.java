package Leetcode;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        /*
        //Time complexity O(nlogn)
        //Approach1
        Arrays.sort(nums);
        return nums[nums.length/2];
        */
        //Approach2 
        //Time Complexity = O(n)
        //Space Complexity = O(1)
        int count = 0;
        int first = nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(count==0){
                first = nums[i];
                count++;
            }
            else if(first==nums[i]){
                count++;
            }
            else count--;
        }
        return first;
    }
}
