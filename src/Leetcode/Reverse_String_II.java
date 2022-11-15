package Leetcode;

public class Reverse_String_II {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            reverse(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    void reverse(char[] arr, int left, int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}
