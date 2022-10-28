package Leetcode;

public class Jump_Game_II {
    public int jump(int[] nums) {
        int jumps = 0;
        int curr = 0;
        int max = 0;
        
        for(int i=0;i<nums.length-1;i++){
            max = Math.max(max, i+nums[i]);
            
            if(i==curr){
                jumps++;
                curr = max;
            }
        }
        return jumps;
    }
}
