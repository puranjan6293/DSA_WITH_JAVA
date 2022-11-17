package Leetcode;

public class Most_Frequent_SubTreeSum {
    /*
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        //Approach, Using post Order traversal
        postOrder(root);
        ArrayList<Integer> list = new ArrayList<>();
        
        //adding element in ArrayList
        for(int e:map.keySet()){
            if(map.get(e)==max) list.add(e);
        }
        
        //adding element in array
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
        
    }
    int postOrder(TreeNode root){
        //base case
        if(root==null) return 0;
        
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = left+right+root.val;
        
        //add values in the map
        map.put(sum, map.getOrDefault(sum,0)+1);
        
        max = Math.max(max, map.get(sum));
        
        return sum;
    }
    */
}
