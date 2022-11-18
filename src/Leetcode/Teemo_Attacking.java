package Leetcode;

public class Teemo_Attacking {
    public int findPoisonedDuration(int[] t, int d) {
        if(t.length==0 || d==0) return 0;
        
        int sum = 0;
        for(int i=1;i<t.length;i++){
            sum+=Math.min(t[i]-t[i-1], d);
        }
        return sum+d;
    }
}
