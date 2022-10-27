package Leetcode;

public class power_of_two {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        // All other odd numbers are not powers of 2...
        else if (n % 2 != 0 || n == 0)
            return false;
        // Recursive function call
        return isPowerOfTwo(n/2);
    }
}
