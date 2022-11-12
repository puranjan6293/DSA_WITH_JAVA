package Leetcode;

public class Find_The_Difference_String {
    public char findTheDifference(String s, String t) {
        /*
        //Approach1, using xor
        char c = 0;
        
        for(char cs:s.toCharArray()) c^=cs;
        for(char ct:t.toCharArray()) c^=ct;
         return c;
         */
        
        //Approach2, substracting their asci values
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<s.length();i++){
            s1+=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            s2+=t.charAt(j);
        }
        return (char)(s2-s1);
    }
}
