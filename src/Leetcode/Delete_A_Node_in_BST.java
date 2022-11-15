package Leetcode;

public class Delete_A_Node_in_BST {
    /*
    public TreeNode deleteNode(TreeNode root, int key) {
        //Approach, using preorder successor
        //base case
        if(root==null) return root;
        
        //case 1, finding the key
        if(key<root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key>root.val){
            root.right = deleteNode(root.right, key);
        }
        
        //case 2, if we got the key
        else{
            //if left child is null
            if(root.left==null){
                return root.right;
            }
            //if right child is null
            else if(root.right==null){
                return root.left;
            }
            
            //if both child's are not null
            root.val = preOrderSucessor(root.right);
            
            root.right = deleteNode(root.right, root.val);
        }
        return root;
        
    }
    static int preOrderSucessor(TreeNode root){
        int minVal = root.val;
        while(root.left!=null){
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }
    */
}
