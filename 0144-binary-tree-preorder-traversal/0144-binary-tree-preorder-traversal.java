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
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> l1=new ArrayList<>();
        return Traversal(root,l1);
    }
    public static List<Integer> Traversal(TreeNode root,List<Integer> l1){
        if(root==null){
            return l1;
        }
        l1.add(root.val);
        Traversal(root.left,l1);
        Traversal(root.right,l1);
        return l1;
    }
}