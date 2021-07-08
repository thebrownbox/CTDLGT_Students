public class _450_Delete_Node_In_BST {
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

    public static TreeNode findLastLeft(TreeNode root) {
        if (root.left == null) {
            return root;
        } else {
            return findLastLeft(root.left);
        }
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
       if (key< root.val) {
           root.left = deleteNode(root.left, key);
       } else if (key>root.val) {
           root.right =(root.right, key);
       } else {
           if (root.left == null) {
               return root.right;
           } else if (root.right == null) {
               return root.left;
           }
           TreeNode tempNode = findLastLeft(root.right);
           root.val = tempNode.val;
           root.right = deleteNode(root.right, root.val);
       }
       return root;
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
        System.out.println(deleteNode(root, 4));
    }
}
