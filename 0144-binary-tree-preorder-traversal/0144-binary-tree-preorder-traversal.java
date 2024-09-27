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
        ArrayList<Integer> a=new ArrayList<>();
        pre(a,root);
        return a;
    }
    public static void pre(ArrayList<Integer> a,TreeNode root){
        if(root==null){
                return ;
            }
        a.add(root.val);
        pre(a,root.left);
        pre(a,root.right);
    }
}