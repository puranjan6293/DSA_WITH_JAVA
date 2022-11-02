package Leetcode;

public class Sum_rootToLeaf_Numbers {
    /*
    public int sumNumbers(TreeNode root) {
        return sumNodes(root, 0);
    }
    static int sumNodes(TreeNode root, int currSum){
        if(root==null) return 0;
        
        currSum = currSum*10+root.val;
        
        //if left & right subTree both null
        if(root.left==null && root.right==null) return currSum;
        
        //call recursion for left subTree and right subTree
        int leftSum = sumNodes(root.left, currSum);
        int rightSum = sumNodes(root.right, currSum);
        
        //return the values
        return leftSum+rightSum;
    }
     */
}
