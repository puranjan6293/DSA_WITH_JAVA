package Leetcode;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    /*
    Now lets understand why this works the way it works and why the bounds are set the way they are set.
    The question says if we find the element we need to return the position of the element, 
    hence we need the condition of low <= high.

     Initialize low = 0 and high as nums.length-1.
     while low <= high we iterate and change the bounds.

     Now if middle element is smaller than the target,
     then the potential position where we need to insert may lie from positions mid+1 till end. 
     So we set low as mid+1. On the other hand,
     if the middle element is larger than the target, then the potential position will lie from low to mid-1. 
     In either cases it cannot be mid.

     So we continue iterating, and finally when low and high cross each other,
     we break out of the loop. Now the question is, which one to return low or high. 
     if we consider carefully, low represents the lower bound of the potential positions where we can insert the elements. 
     Meaning the position must be atleast low or greater. Since low and high have already crossed each other, We cannot insert at high. 
     We have to insert at low. Hence we return low.
     */
}
