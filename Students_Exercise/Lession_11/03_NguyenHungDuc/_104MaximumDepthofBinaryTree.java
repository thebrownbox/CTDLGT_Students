
//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class _104MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
       if (root == null){
           return 0;
       }
       int leftHeight = maxDepth(root.left)+1;
       int rightHeight = maxDepth(root.right)+1;

       return Math.max(leftHeight, rightHeight);
    }
}