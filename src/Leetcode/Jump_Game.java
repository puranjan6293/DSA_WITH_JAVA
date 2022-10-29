package Leetcode;

public class Jump_Game {
    public boolean canJump(int[] nums) {
        /*
        //Approach1
        int lastIdx = nums.length-1;
        for(int i=lastIdx;i>=0;i--){
            if(i+nums[i]>=lastIdx){
                lastIdx = i;
            }
        }
        return lastIdx==0;
        */
        
        //Approach2, DP
        //it shows at max what index can I reach.
        //initially I can only reach index 0, hence reach = 0
        int reach = 0;
        for(int i=0;i<nums.length;i++){
            //at every index I'll check if my reach was atleast able to 
            //reach that particular index.
            
            //reach >= idx -> great, carry on. Otherwise, 
            if(reach<i) return false;
            reach = Math.max(reach, i+nums[i]);
            //this means that you reached till the end of the array, wohooo!!
        }
        return true;
    }
}
