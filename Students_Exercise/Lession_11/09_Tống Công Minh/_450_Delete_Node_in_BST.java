package lab10_Tree;

public class _450_Delete_Node_in_BST {

    public static void main(String[] args) {

    }
    
    public static TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            //Neu node can xoa tai leaf
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null && root.right != null) { // right khac null
                return root.right;
            } else if (root.left != null && root.right == null) { // left khac null
                return root.left;
            } else {
                TreeNode traiCung = findMostLeftNode(root.right);
                root.val = traiCung.val;
                root.right = deleteNode(root.right, traiCung.val);
            }
        }

        return root;
    }
    
    /**
     * Trai cung dung recursion
     * @param root
     * @return
     */
    public static TreeNode findTraiCung(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }
        return findTraiCung(root.left);
    }

    /**
     * Trai cung dung while loop
     * @param root
     * @return
     */
    public static TreeNode findMostLeftNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }
}
