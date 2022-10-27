package Leetcode;

public class Bit_count_HammingDistance {
    public int hammingDistance(int x, int y) {
        /*
        //Approach1
        int count = 0;
        while(x!=0 || y!=0){
            if((x&1) != (y&1)){
                count++;
            }
            y >>= 1;
            x >>= 1;
        }
        return count;
        */
        //Approach2
        return Integer.bitCount(x^y);
    }
}
