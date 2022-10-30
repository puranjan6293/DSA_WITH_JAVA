package Leetcode;

public class ZigZag_LevelOrder_Traversal_Tree {
    /*
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        //add the root valuse first
        q.add(root);
        
        int oddEven = 0; //use to find the curr level is odd or even
        while(!q.isEmpty()){
            int size = q.size();
            //make a new arraylist to store each level values
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                level.add(node.val);
            }
            //check if curr level is odd or even
            //if odd level, than reverse the curr level
            if(oddEven%2!=0) Collections.reverse(level);
            ans.add(level);
            oddEven++;
        }
        return ans;
    }
     */
}
