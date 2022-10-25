package Leetcode;

public class Add_Binary {
    public String addBinary(String a, String b) {
        /*
        //Approach1
        int carry = 0;
        String result ="";
        int alen = a.length();
        int blen = b.length();
        int i = 0;
        while(i<alen || i<blen || carry!=0){
            int x = 0;
            if(i<alen && a.charAt(alen-1-i)=='1'){
                x = 1;
            }
            int y = 0;
            if(i<blen && b.charAt(blen-1-i)=='1'){
                y = 1;
            }
            result = (x+y+carry)%2+result;
            carry = (x+y+carry)/2;
            i++;
        }
        return result;
        */
        
        //Approach2
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
