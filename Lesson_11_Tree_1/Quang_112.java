package lesson11;

public class Quang_112 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(11);
        TreeNode n4 = new TreeNode(13);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(2);
        TreeNode n8 = new TreeNode(1);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.right = n8;

        System.out.println(hasPathSum(root,22));
    }

    public static boolean hasPathSum(TreeNode root,int size){
        if(root==null)
            return false;
        if(isLeaf(root))
            return root.val == size;
        return hasPathSum(root.left,size-root.val) || hasPathSum(root.right,size-root.val);

    }

    public static boolean isLeaf(TreeNode node){
        return node.left == null && node.right ==null;
    }

}
