package lesson11;

import java.util.ArrayList;

public class Quang_173 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(15);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(20);
        root.left = n1;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;
        BSTIterator obj = new BSTIterator(root);
        while(obj.hasNext()){
            System.out.println(obj.next());
        }
    }

}

class BSTIterator{
    private ArrayList<Integer> list = new ArrayList<>();
    private int current = 0;
    public BSTIterator(TreeNode root) {
        inorder(root);
    }

    /** @return the next smallest number */
    public int next() {
        return list.get(current++);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(current<list.size())
            return true;
        return false;
    }

    private void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
