package Leetcode;

public class Count_Prime_Numbers {
    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];
        int count = 0;
        
        for(int i=2;i<n;i++){
            if(flag[i]) continue;
            count++;
            
            for(int j=i;j<n;j=j+i){
                flag[j] = true;
            }
        }
        return count;
    }
}
