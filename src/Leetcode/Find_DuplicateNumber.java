package Leetcode;

public class Find_DuplicateNumber {
    public int findDuplicate(int[] nums) {
        /*
        //Approach1
        for (int n : nums) {
            if (nums[Math.abs(n)] < 0) {
                return Math.abs(n);
            } else {
                nums[Math.abs(n)] *= -1;
            }
        }
        return -1;
        */
        //Approach2, using fast and slow pointer, T.C : O(n)
        int slow = 0;
        int fast = 0;
        int n = nums.length;
        while(fast<n && nums[fast]<n){
            slow = nums[slow];
            fast = nums[nums[fast]];
            
            if(slow == fast){
                slow = 0;
                while(slow!=fast){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
        return -1;
    }
}
