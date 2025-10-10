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
    ArrayList<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return res;
    }
    void inOrder(TreeNode node) {
        if (node == null)
            return;
        
        // Traverse the left subtree first
        inOrder(node.left);
        
        // Visit the current node
        res.add(node.val);
        
        // Traverse the right subtree last
        inOrder(node.right);
    }
}