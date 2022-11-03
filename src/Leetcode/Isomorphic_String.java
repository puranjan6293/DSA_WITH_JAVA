package Leetcode;

public class Isomorphic_String {
    public boolean isIsomorphic(String s, String t) {
        /*
        //Approach1
        HashMap m = new HashMap<>();
        for (Integer i=0; i<s.length(); ++i){
            if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i))
                return false;
        }
        return true; 
        */
        //Approach2, O(n)
        char[] sArray= s.toCharArray();
        char[] tArray = t.toCharArray();

        int length = sArray.length;
        if(length != tArray.length) return false;

        char[] sm = new char[256];
        char[] tm = new char[256];

        for(int i=0; i<length; i++){
            char sc = sArray[i];
            char tc = tArray[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                if(sm[sc] != tc || tm[tc] != sc){
                    return false;
                }
            }
        }
        return true;
    }
}
