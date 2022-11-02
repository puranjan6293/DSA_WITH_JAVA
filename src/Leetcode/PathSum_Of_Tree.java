package Leetcode;

public class PathSum_Of_Tree {
    /*
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        pathRecursive(ans, list, targetSum, root);
        
        return ans;
        
    }
    //we need one curr node so it is added int the method
    public static void pathRecursive(List<List<Integer>> ans, List<Integer> list, int targetSum, TreeNode curr){
        if(curr==null) return;
        
         // add the current node to the path
        list.add(curr.val);
        //if the current node is a leaf and its value is equal to sum, save the current path
        if(curr.val==targetSum && curr.left==null && curr.right==null){
            ans.add(new ArrayList<>(list));
        }
        else{
            //Traverse on left subtree
            pathRecursive(ans, list, targetSum-curr.val, curr.left);
            
            //Traverse on right subTree
            pathRecursive(ans, list, targetSum-curr.val, curr.right);
        }
        //remove the curr node from the path list to backTrack
        //we need to remove the current node while we are going up the recursive call stack.
        list.remove(list.size()-1);
    }
    */
}
