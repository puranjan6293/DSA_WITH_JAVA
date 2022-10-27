package Leetcode;

public class Binary_Tree_Paths {
    /*
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        String str = " ";
        traverse(root, "", ans);
        return ans;
    }
    static void traverse(TreeNode root, String str, List<String> list){
        //base case
        if(root==null) return;
        str+=(root.val+"");
        
        if(root.left==null && root.right==null){
            list.add(str);
        }
        str+="->";
        traverse(root.left, str, list);
        traverse(root.right, str, list);
    }
     */
}
