package Leetcode;

public class Kth_Largest_element_in_Array {
    public int findKthLargest(int[] nums, int k) {
        /*
        //Approach1, T.C : O(n logn)
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        return nums[(n-k)];
        */
        
        //Approach2, T.C : O(n)
        int start = 0, end = nums.length - 1, index = nums.length - k;
        while (start < end) {
            int pivot = partion(nums, start, end);
            if (pivot < index) start = pivot + 1; 
            else if (pivot > index) end = pivot - 1;
            else return nums[pivot];
        }
        return nums[start];
    }
    
    private int partion(int[] nums, int start, int end) {
        int pivot = start, temp;
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) start++;
            while (start <= end && nums[end] > nums[pivot]) end--;
            if (start > end) break;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        temp = nums[end];
        nums[end] = nums[pivot];
        nums[pivot] = temp;
        return end;
    }
}
