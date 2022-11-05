package Leetcode;

public class ExcelSheet_colom_number {
    public int titleToNumber(String columnTitle) {
        //base case 
        if(columnTitle==null) return -1;
        
        int sum = 0;
        //traverse through the input String
        /*
        for(char c : columnTitle.toUpperCase().toCharArray()){
            sum*=26;
            sum += c-'A'+1;
        }
        */
        for(int i=0;i<columnTitle.length();i++){
            sum*=26;
            sum+=columnTitle.charAt(i)-'A'+1;
        }
        return sum;
    }
    /*
    public static void main(String[] args) {
        String s = "ABC";
        int sum = 0;
        for(char c:s.toUpperCase().toCharArray()){
            sum*=26;
            sum+=c-'A'+1;
        }
        System.out.println(sum);
    }
    */
}
