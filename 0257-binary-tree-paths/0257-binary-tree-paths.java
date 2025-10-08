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
            
            String num = String.valueOf(p.left.val);
            String newRoute = curRoute + "->" + num;
            isTrue(p.left, newRoute, result);
        }
        if(p.right != null){
            
            String num = String.valueOf(p.right.val);
            String newRoute = curRoute + "->" + num;
            isTrue(p.right, newRoute, result);
        }

        
    }
}