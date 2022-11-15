package Leetcode;
import java.util.*;
public class one_three_two_pattern {
    public boolean find132pattern(int[] nums) {
        //Approach, using Deque for constant T.C
        Deque<Integer> dq = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!dq.isEmpty() && dq.peek() < nums[i]) {
                max = dq.pop();
            }
            if (nums[i] > max) dq.push(nums[i]);
            if (nums[i] < max) return true;
        }
        return false;
    }
}
