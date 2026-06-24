/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        dfs(root,"",l);
        return l;
    }
    public void dfs(TreeNode root,String path,List<String> l){
        if(root==null) return;
        path+=root.val;
        if(root.left==null && root.right==null){
            l.add(path);
        }
        else{
            dfs(root.left,path+"->",l);
            dfs(root.right,path+"->",l);
        }

    }
}