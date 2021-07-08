public class _112 {


    public boolean hasPathSum(_450.TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        int remain = targetSum - root.val;

        if (remain == 0 && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
