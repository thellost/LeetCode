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
    ArrayList<String> result = new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        isTrue(root, String.valueOf(root.val));
        return result;
    }

    
    void isTrue(TreeNode p, String curRoute){

        
        if(p.left == null && p.right == null){
            result.add(curRoute);
            return;
        }
        if(p.left != null){
            isTrue(p.left, curRoute + "->" + p.left.val);
        }
        if(p.right != null){
             isTrue(p.right, curRoute + "->" + p.right.val);
        }

        
    }
}