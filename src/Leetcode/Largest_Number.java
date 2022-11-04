package Leetcode;
import java.util.*;
public class Largest_Number {
    public String largestNumber(int[] nums) {
        //base case
        if(nums.length==0) return "";
        
        //convert int array to string and add in to a string array
        String[] conv = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            conv[i] = Integer.toString(nums[i]);
        }
        
        //compare numerical values of two strings using lambda function and sort
        // for eeample:[12,5]
        // a+b=125
        // b+a=512
        Arrays.sort(conv,(a,b)->(b+a).compareTo(a+b));
        
        //make a new String using StringBuilder
        StringBuilder ans = new StringBuilder();
        
        //after sorting if the array start with 0 then return 0
        if(conv[0].equals("0")) return "0";
        
        //else append all values in ans
        for(int i=0;i<conv.length;i++){
            ans.append(conv[i]);
        }
        
        return ans.toString();
    }
}
