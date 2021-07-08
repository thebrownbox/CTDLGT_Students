public class _450_Delete_Node_in_a_BST {

    public static class TreeNode{
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
        if(root == null){
            return null;
        }else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                TreeNode rightChild = root.right;
                while(rightChild.left != null){
                    rightChild = rightChild.left;
                }
                root.val = rightChild.val;
                root.right = deleteNode(root.right, rightChild.val);
            }
        }
        return root;
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
        n2.right = n5;
        // TreeNode root1 = new TreeNode(0);
        deleteNode(root, 3);
    }
}
