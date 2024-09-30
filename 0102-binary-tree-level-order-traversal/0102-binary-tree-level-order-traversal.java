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
    private List<List<Integer>> a = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return a;
        }
        bfs(root, 0);
        return a;
    }

    public void bfs(TreeNode p, int l) {
        if (p == null) {
            return;
        }
        if (a.size() == l) {
            a.add(new ArrayList<>());
        }
        a.get(l).add(p.val);
        bfs(p.left, l + 1);
        bfs(p.right, l + 1);
    }
}
