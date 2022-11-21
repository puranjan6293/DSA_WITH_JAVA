package Leetcode;

public class Validate_BST {
    /*
    public boolean isValidBST(TreeNode root) {
        //Approach, using recursion, T.C : O(n), n is height of the tree
        return recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean recursion(TreeNode root, long minVal, long maxVal){
        //base case
        if(root==null) return true;
        
        if(root.val>=maxVal || root.val<=minVal) return false;
        
        return recursion(root.left, minVal, root.val) && recursion(root.right, root.val, maxVal);
    }
     */
}
