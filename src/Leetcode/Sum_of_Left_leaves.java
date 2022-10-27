package Leetcode;

public class Sum_of_Left_leaves {
    /*
    public int sumOfLeftLeaves(TreeNode root) {
        //base case
        if(root==null) return 0;
        
        //if left node is a leaf node
        if(root.left!=null && root.left.left==null && root.left.right==null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        
        //exploring the tree furthere
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
     */
}
