package Leetcode;

public class Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        //base case
        if(num==1) return false;
        
        int i = 2;
        int sq =(int)Math.sqrt(num);
        int sum=1;
        while(i<=sq){
            if(num%i==0) {
                sum+=i;
                sum+=num/i;
            }
            i++;
        }
        if(sum==num) return true;
        
        return false;
    }
}
