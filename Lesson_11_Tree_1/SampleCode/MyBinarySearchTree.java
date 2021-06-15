import java.util.ArrayList;
import java.util.List;

public class MyBinarySearchTree {
    private TreeNode root;

    MyBinarySearchTree()
    {

    }

    // public TreeNode insertIntoBST(TreeNode root, int val) {
    // }

    public TreeNode searchBST(TreeNode curNode, int val) {
        if(curNode == null)
            return null;
        
        if(curNode.val == val)
            return curNode;
        
        if(val > curNode.val)
            return searchBST(curNode.right, val);
            
        return searchBST(curNode.left, val);
    }

    public void add(int val)
    {
        TreeNode newNode = new TreeNode(val);
        if(root == null){
           root = newNode;
        }else{
            subAdd(root, newNode);
        }
    }

    private void subAdd(TreeNode curNode, TreeNode newNode)
    {
        if(newNode.val < curNode.val){
            if(curNode.left == null){
                curNode.left = newNode;
            }else{
                subAdd(curNode.left, newNode);
            }
        }

        if(newNode.val > curNode.val){
            if(curNode.right == null){
                curNode.right = newNode;
            }else{
                subAdd(curNode.right, newNode);
            }
        }
    }


    public void print()
    {
        if(root == null){
            System.out.println("Tree is empty!");
            return;
        }

        List<Integer> result = preOrderTravel(root);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }


    private List<Integer> preOrderTravel(TreeNode curNode)
    {
        List<Integer> result = new ArrayList<>();
        subPreOrderTravel(curNode, result);
        return result;
    }

    private void subPreOrderTravel(TreeNode curNode, List<Integer> result)
    {
        if(curNode == null){
            return ;
        }

        // cong thuc
        // System.out.println(curNode.val);
        result.add(curNode.val);
        subPreOrderTravel(curNode.left, result);
        subPreOrderTravel(curNode.right, result);
    }
}
