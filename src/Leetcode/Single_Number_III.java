package Leetcode;

public class Single_Number_III {
    public int[] singleNumber(int[] nums) {
        /*
        //Approach1, using HashSet
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int e:nums){
            if(hs.contains(e)){
                hs.remove(e);
            }
            else hs.add(e);
        }
        Object[] dummy = hs.toArray();
        
        int[] ans = new int[2];
        ans[0] = (int)dummy[0];
        ans[1] = (int)dummy[1];
        
        return ans;
        */
        
        //Approach2, usig XOR 
        // go through the array and XOR every element, for example, result = 6 (3^5)
        int first = nums[0];
        for(int i=1;i<nums.length;i++){
            first^=nums[i];
        }
        // notice that 6^5 = 3, 6^3 = 5
        // now how to find 3 and 5 from 6
        int[] ans = new int[2];
        // find the lowest bit of the result
        // let's say 6 (0110), -6 = 1010  0110 & 1010 = 0010
        int lowbit = first & -first;
        // since this bit from the result is 1, we can be sure that 
        // a & lowbit and b & lowbit have different result
        for(int n : nums){
            if((n & lowbit) == 0) ans[0] ^= n;
            else ans[1] ^=n;
        }
        return ans;
    }
}
