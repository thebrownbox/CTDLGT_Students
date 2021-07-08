public class _450_Delete_Node_in_a_BST {
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

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            TreeNode temp = search(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }

    public static TreeNode search(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void print(TreeNode root) {
        if (root == null) {
            return;

        }
        System.out.println(root.val + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;

        System.out.println(deleteNode(root, 3));
        print(root);
    }

}
