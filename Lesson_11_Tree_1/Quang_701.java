package lesson11;

public class Quang_701 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        insertIntoBST(root,2);
        insertIntoBST(root,7);
        insertIntoBST(root,1);
        insertIntoBST(root,3);
        inorder(root);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }

        TreeNode parent = null;
        TreeNode cur = root;
        while(cur!=null){
            if(val<cur.val){
                parent = cur;
                cur = cur.left;
            }else if(val>cur.val){
                parent = cur;
                cur = cur.right;
            }
            else
                return root;
        }
        if(val<parent.val){
            parent.left = new TreeNode(val);
        }
        else
            parent.right = new TreeNode(val);
        return root;
    }

    public static void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }
}


