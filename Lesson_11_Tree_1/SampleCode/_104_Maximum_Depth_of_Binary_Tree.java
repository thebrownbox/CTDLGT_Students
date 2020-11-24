public class _104_Maximum_Depth_of_Binary_Tree {

    static public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int maxLeftDepth = 1 + maxDepth(root.left);
        int maxRightDepth = 1 + maxDepth(root.right);

        return Math.max(maxLeftDepth, maxRightDepth);
    }

    public static void main(String[] args) {
                TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n4.left = n2;
        n4.right = n6;

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;


        maxDepth(n4);
    }
}
