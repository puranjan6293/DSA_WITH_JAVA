package Leetcode;

public class Ransom_Note {
    public boolean canConstruct(String n, String m) {
        // Initialize an array of count with the size 26...
        int[] arr = new int[128];
        // Traverse a loop through the entire String of magazine where char ch stores the char         at the index of magazine..
        for(char ch:m.toCharArray()){
            ++arr[ch];
        }
        // Run another for loop for ransomNote...
        for(char c:n.toCharArray()){
            if(--arr[c]<0){
                return false;
            }
        }
        //if nothing goes wrong return true
        return true;
    }
}
