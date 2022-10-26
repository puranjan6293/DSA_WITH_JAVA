package Leetcode;

public class Minimum_depth_of_BinaryTree {
    /*
    public int minDepth(TreeNode root) {
        //Approach1
        if(root==null) return 0;
        
        int ld = minDepth(root.left);
        int rd = minDepth(root.right);
        
        if(ld==0 || rd==0) return ld+rd+1;
        else return Math.min(ld,rd)+1;
        
        //Approach2
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int count = 1;
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                if(q.peek().left==null && q.peek().right==null) return count;
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                q.poll();
            }
            count++;
        }
        return count;
    }
    */
}
