package Leetcode;

public class Two_Sum_in_SortedArray {
    public int[] twoSum(int[] numbers, int target) {
        //we can solve it by using two pointers
        int left = 0;
        int right = numbers.length-1;
        
        //loop
        while(left<right){
            //finding the sum
            int sum = numbers[left]+numbers[right];
            
            //if sum==target
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            
            //if sum is less than target
            if(sum<target) left++;
            else right--;  
        }
        return new int[]{-1};
    }
}
