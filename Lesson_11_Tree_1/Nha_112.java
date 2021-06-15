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
    boolean check = false;
    
    public void pathSum(TreeNode curNode, int curSum, int sum){
        if (curNode.left == null && curNode.right == null){
            curSum += curNode.val;
            if (curSum == sum){
                check = true;
            }
            return;
        }
        
        if (!check && curNode.left != null){
           pathSum(curNode.left, curSum + curNode.val, sum); 
        }
        if (!check && curNode.right != null){
            pathSum(curNode.right, curSum + curNode.val, sum);
        }
    }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }
        
        pathSum(root, 0, sum);
        
        return check;
    }
}