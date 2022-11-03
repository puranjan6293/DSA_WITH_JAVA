package Leetcode;

public class Right_view_BinaryTree {
    /*
    //Approach
    //Each depth of the tree only select one node.
    //View depth is current size of result list.
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(ans, root, 0);
        return ans;
    }
    static void rightView(List<Integer> ans, TreeNode curr, int minDepth){
        //base case
        if(curr==null) return;
        
        if(minDepth==ans.size()){
            ans.add(curr.val);
        }
        rightView(ans, curr.right, minDepth+1);
        rightView(ans, curr.left, minDepth+1);
    }
     */
}
