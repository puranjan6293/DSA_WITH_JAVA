package Leetcode;

public class Compare_Version_Numbers {
    public int compareVersion(String version1, String version2) {
        //we can solve it by using pointers
        int i = 0;
        int j = 0;
        int len1 = version1.length();
        int len2 = version2.length();
        
        while(i<len1 || j<len2){
            int temp1 = 0;
            int temp2 = 0;
            
            //for string 1
            while(i<len1 && version1.charAt(i)!='.'){
                temp1 = temp1*10 + version1.charAt(i++)-'0';
            }
            
            //for string 2
            while(j<len2 && version2.charAt(j)!='.'){
                temp2 = temp2*10 + version2.charAt(j++)-'0';
            }
            
            //if temp1 is bigger than temp2
            if(temp1>temp2) return 1;
            //if temp2 is bigger than temp1
            else if(temp1<temp2) return -1;
            else{
                i++;
                j++;
            }
        }
        return 0;
    }
}
