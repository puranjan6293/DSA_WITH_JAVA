package Leetcode;

public class Reverse_Words_in_String {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String ans = "";
        
        int n = str.length;
        //Using a for loop to iterate and print words in reverse
        for(int i=n-1;i>=0;i--){
            //This means that when there isn't a whitespace or you getting a word in the array then add it to the ans string
            if(str[i]!=" "){
                //we need to add + "_" because then the output will reverse the words and print it without space like blue new - newblue
                ans+=str[i]+" ";
            }
        }
        //The trim method does not modify the original string, therefore we have to store it in ans
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args) {
        /*
        String s = "I am good boy";
        String[] str = s.split("\\s+");
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str[i]+" ");
        }
        */
    }
}
