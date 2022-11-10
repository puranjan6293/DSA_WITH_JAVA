package Leetcode;

public class water_and_jug_problem {
    public boolean canMeasureWater(int x, int y, int z) {
        //this is an mathematical problem, here we can use Bezout's identity
        
        //base case
        if(x+y<z) return false;
        
        //if x or y is zero
        if(x==z || y==z || x+y==z) return true;
        
        //by bezouts law
        return z % bezouts(x, y)==0;
    }
    int bezouts(int x, int y){
        if(y==0) return x;
        return bezouts(y, x%y);
    }
}
