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
    public List<Integer> postorderTraversal(TreeNode root) {
       ArrayList<Integer> a=new ArrayList<> ();
       pos(root,a);
       return a;
    }
    public static void pos(TreeNode root,ArrayList<Integer> a){
        if(root==null){
            return;
        }
        pos(root.left,a);
        pos(root.right,a);
        a.add(root.val);
    }
}