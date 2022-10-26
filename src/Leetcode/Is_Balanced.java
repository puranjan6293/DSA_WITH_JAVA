package Leetcode;

public class Is_Balanced {
    /*
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
         //All Nodes in the tree have an Absolute Difference of Left Height & Right Height not more than 1.
        else if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
        
    }
    static int height(TreeNode root){
        if(root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh,rh)+1; ///+1 because we have to cosider the root.data
    }
     */
}
