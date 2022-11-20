package Leetcode;

public class Kth_Smallest_element_in_BST {
    /*
    private int count = 0;
    private int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        //Approach using DFS, T.C : O(n)
        count = k;
        dfs(root);
        return ans;
    }
    void dfs(TreeNode root){
        //left subtree
        if(root.left!=null) dfs(root.left);
        count--;
        //update ans
        if(count==0){
            ans = root.val;
            return;
        }
        //right subtree
        if(root.right!=null) dfs(root.right);
        
    }
     */
}
