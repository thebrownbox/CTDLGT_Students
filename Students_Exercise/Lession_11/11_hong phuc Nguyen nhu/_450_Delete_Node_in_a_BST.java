public class _450_Delete_Node_in_a_BST {
    public static class TreeNode {
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

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        TreeNode newNode = findMin(root.right);
        root.val = newNode.val;
        root.right = deleteNode(root.right, key);
        }
        return root;
    }

    private static TreeNode findMin(TreeNode node) {
        if (node.left != null) {
            node = node.left;
        }
        return node;
    }
    public static void main(String[] args) {
        
    }
}
