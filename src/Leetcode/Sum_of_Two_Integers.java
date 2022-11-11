package Leetcode;

public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        //Approach, using bit magic XOR function, T.C : O(n)
        
        //base case
        if(a==0) return b;
        if(b==0) return a;
        
        while (b != 0) {
		int carry = a & b;
		a = a ^ b;
		b = carry << 1;
        }
        return a;
	}
}
