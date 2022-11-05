package Leetcode;

public class first_missing_positive {
    public int firstMissingPositive(int[] nums) {
        /*
        //Approach1, using sorting, T.C : O(nlogn), S.C : O(1)
        Arrays.sort(nums);
        int n = nums.length;
        int lastSeen = 1;
        for(int i = 0;i<n;i++){
             // ignore non-positives and duplicates
            if(nums[i]<=0 || (i>0 && nums[i]==nums[i-1])){
                continue;
            }
            if(nums[i]==lastSeen){
                lastSeen++;
            }
            else break;
        }
        return lastSeen;
        */
        
        /*
        //Approach2, using HashSet, T.C : O(n), S.C : O(n)
        HashSet<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int e:nums){
            s.add(e);
            //also find the max value of the array
            max = Math.max(max, e);
        }
        
        //base case if max is less than 1
        if(max<1){
            return 1;
        }
        //traverse 1 to max, if set not contain i, than i is the ans
        for(int i=1;i<=max;i++){
            if(!s.contains(i)){
                return i;
            }
        }
        //if the set contains i than oveously ans is max value + 1
        return max+1;
        */
        
        //Approach3, using swapp, T.C : O(n), S.C : O(1)
        var n = nums.length;
	    for (var i = 0; i < nums.length; i++)
		    //  put positives in their right place as long as possible
		    while (0 <= nums[i] - 1 && nums[i] - 1 < n && nums[i] != nums[nums[i] - 1]) 
			    swap(nums, nums[i] - 1, i);

	    // scan for first missing positive
	    for (var i = 0; i < n; i++)
		    if (nums[i] != i + 1)
			    return i + 1;
	    return n + 1;
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
