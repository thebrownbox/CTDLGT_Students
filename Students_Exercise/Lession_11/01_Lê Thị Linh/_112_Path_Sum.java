
/**
 * _20_Path_Sum
 */
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

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null) {
            return sum == root.val;
        } else {
            return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(11);
        TreeNode n4 = new TreeNode(10);
        TreeNode n5 = new TreeNode(13);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(1);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n3.left = n4;
        n3.right = n5;
        n2.left = n6;
        n2.right = n7;

        System.out.println(hasPathSum(root, 33));
        System.out.println("-----------");
        System.out.println(hasPathSum(root, 10));

    }
}