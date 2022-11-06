package Leetcode;

public class BinaryTree_max_pathSum {
    /*
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMax(root);
        return max;
    }
    int findMax(TreeNode root){
        //base case
        if(root==null) return 0;
        
        //max in right and left subtree
        int leftMax = Math.max(0, findMax(root.left));
        int rightMax = Math.max(0, findMax(root.right));
        
        //max between all
        max = Math.max(max, leftMax+rightMax+root.val);
        
        //return the max
        return Math.max(leftMax, rightMax)+root.val;
    }
     */
}
