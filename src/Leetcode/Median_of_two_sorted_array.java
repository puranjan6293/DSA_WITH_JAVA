package Leetcode;

public class Median_of_two_sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx1 = 0;
        int idx2 = 0;
        int med1 = 0;
        int med2 = 0;
        
        for(int i=0;i<=(nums1.length+nums2.length)/2;i++){
            med1 = med2;
            if (idx1 == nums1.length) {
                med2 = nums2[idx2];
                idx2++;
            }else if (idx2 == nums2.length) {
                med2 = nums1[idx1];
                idx1++;
            }else if (nums1[idx1] < nums2[idx2] ) {
                med2 = nums1[idx1];
                idx1++;
            }else {
                med2 = nums2[idx2];
                idx2++;
            }
        }
         // the median is the average of two numbers
        if((nums1.length+nums2.length)%2==0){
            return (float)(med1+med2)/2;
        }
        return med2;
    }
}
