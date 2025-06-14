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
    public List<Integer> inorderTraversal(TreeNode root) {
         ArrayList<Integer> a=new ArrayList<>();
        in(root,a);
        return a;
    }
    public static void in(TreeNode root,ArrayList<Integer> a){
        if(root==null){
            return;
        }
        in(root.left,a);
        a.add(root.val);
        in(root.right,a);
    }
}