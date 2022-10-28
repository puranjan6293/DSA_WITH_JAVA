package Leetcode;

public class Number_Of_Complement {
    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
