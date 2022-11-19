package Leetcode;

public class construct_binaryTree_from_po_io {
    /*
    private int ps = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recursion(preorder, inorder, 0, preorder.length-1);
    }
    private TreeNode recursion(int[] preorder, int[] inorder, int left, int right){
        
        if(ps==preorder.length || left>right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[ps]);
        for(int i=left;i<=right;i++){
            if (preorder[ps] == inorder[i]) {
                ps++;
                root.left = recursion(preorder, inorder, left, i - 1);
                root.right = recursion(preorder, inorder, i + 1, right);
                break;
            }
        }
        return root;
    }
     */
}
