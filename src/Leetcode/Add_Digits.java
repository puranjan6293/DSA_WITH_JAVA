package Leetcode;

public class Add_Digits {
    public int addDigits(int num) {
        /*
        //Recursive Approach
        //  Variable to store the digit sum...
        int sum = 0;
        // Converts num value into string...
        String s = String.valueOf(num);
        // Calculation of digit sum...
        for(int i = 0; i < s.length(); i++){
            sum = sum + (s.charAt(i) - '0');
        }
        // If  sum is less than 10, it is the digital root. Return it...
        if(sum < 10){
            return sum;
        }else{
            return addDigits(sum);      // Sum becomes the new number. Call the function again with sum as parameter...
        }
        */
        
        //Mathematical Approach
        if(num==0) return 0;
        if(num%9==0) return 9;
        return num%9;
    }
}
