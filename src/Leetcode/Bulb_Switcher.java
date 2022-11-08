package Leetcode;

public class Bulb_Switcher {
    public int bulbSwitch(int n) {
        
        //Approach1, T.C : O(1)
        return (int) Math.sqrt(n);
        
        
        /*
        //Approach2, T.C O(n)
        int count = 0;
        for(long i=1;i*i<=n;i++){
            count++;
        }
        return count;
        */
    }
}
