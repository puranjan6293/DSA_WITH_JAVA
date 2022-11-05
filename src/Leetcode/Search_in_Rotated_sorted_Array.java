package Leetcode;

public class Search_in_Rotated_sorted_Array {
    public int search(int[] nums, int target) {
        /*
        //Approach1,
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
        */
        
        //Approach2
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // the left half is monotonic, yet still does not satisfy
                if (nums[left] <= nums[mid] && nums[left] > target) { 
                    left = mid + 1;
                } else {
                right = mid - 1;
                }
            } else {
                // the right half is monotonic, yet still does not satisfy
                if (nums[right] >= nums[mid] && nums[right] < target) { 
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
