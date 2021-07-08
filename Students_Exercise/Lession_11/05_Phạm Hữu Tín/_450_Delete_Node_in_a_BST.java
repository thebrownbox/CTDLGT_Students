public class _450_Delete_Node_in_a_BST {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) 
        return null;
        if(root.val > key)
        root.left = deleteNode(root.left, key);
        else if(root.val < key)
        root.right = deleteNode(root.right, key);
        else{
            if(root.left == null)
            return root.right;
            if(root.right == null)
            return root.left;
            TreeNode rightMin = root.right;
            while(rightMin.left != null ) rightMin = rightMin.left;
            rightMin.left = root.left;
            return root.right;

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
