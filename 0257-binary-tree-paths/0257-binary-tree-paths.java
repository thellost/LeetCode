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
        ArrayList<String> result = new ArrayList<String>();
        isTrue(root, String.valueOf(root.val), result);
        return result;
    }

    
    void isTrue(TreeNode p, String curRoute,List<String> result){

        
        if(p.left == null && p.right == null){
            result.add(curRoute);
            return;
        }
        if(p.left != null){
            isTrue(p.left, curRoute + "->" + p.left.val, result);
        }
        if(p.right != null){
             isTrue(p.right, curRoute + "->" + p.right.val, result);
        }

        
    }
}