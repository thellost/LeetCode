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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isTrue(root, 0, targetSum);
    }

    boolean isTrue(TreeNode p, int num, int sum){

        
        if(p == null){
            return false;
        }

        int newNum = num + p.val; 

        if(newNum == sum && p.left == null & p.right == null ){
            return true;
        } else{
            return isTrue(p.left, newNum, sum) || isTrue(p.right, newNum, sum);
        }
    }
}