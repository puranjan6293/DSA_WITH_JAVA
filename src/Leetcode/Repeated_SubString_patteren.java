package Leetcode;

public class Repeated_SubString_patteren {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    //main function, used for understanding how to work this process
    public static void main(String[] args) {
        String St = "abcdabcd";
        String sst = St+St;
        System.out.println(sst.substring(1,sst.length()-1));
    }
}
