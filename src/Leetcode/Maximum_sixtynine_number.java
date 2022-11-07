package Leetcode;

public class Maximum_sixtynine_number {
    public int maximum69Number (int num) {
        char[] ans = Integer.toString(num).toCharArray();
        for(int i=0;i<ans.length;i++){
            if(ans[i]=='6'){
                ans[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(ans));
    }
}
