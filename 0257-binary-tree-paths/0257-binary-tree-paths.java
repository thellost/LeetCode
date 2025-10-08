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
        isTrue(root, "");
        return result;
    }

    
    void isTrue(TreeNode p, String curRoute){

        if(p==null){
            return;
        }
        curRoute = curRoute + p.val;
        if(p.left == null && p.right == null){
            result.add(curRoute);
            return;
        }
        curRoute += "->";
            isTrue(p.left, curRoute);
             isTrue(p.right, curRoute);

        
    }
}