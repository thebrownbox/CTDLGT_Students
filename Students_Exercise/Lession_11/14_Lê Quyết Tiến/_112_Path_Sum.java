public class _112_Path_Sum {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null || root.val > targetSum) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        } else {
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }

    public static void main(String[] args) throws Exception {
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(2);
        TreeNode n8 = new TreeNode(1);
        TreeNode n4 = new TreeNode(13, null, n8);
        TreeNode n2 = new TreeNode(8, n4, n5);
        TreeNode n3 = new TreeNode(11, n6, n7);
        TreeNode n1 = new TreeNode(4, n3, null);
        TreeNode root = new TreeNode(5, n1, n2);
        System.out.println(hasPathSum(root, 22));

    }
}
