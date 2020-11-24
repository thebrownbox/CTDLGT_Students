import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static List<Integer> postOrderTraversal(TreeNode curNode)
    {
        List<Integer> result = new ArrayList<>();
        subPostOrderTravel(curNode, result);
        return result;
    }

    public static void subPostOrderTravel(TreeNode curNode, List<Integer> result)
    {
        if(curNode == null){
            return ;
        }

        // cong thuc
        // System.out.println(curNode.val);
        subPostOrderTravel(curNode.left, result);
        subPostOrderTravel(curNode.right, result);
        result.add(curNode.val);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n4.left = n2;
        n4.right = n6;

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;

        System.out.println("Cay n4");
        List<Integer> resultPreOrder = postOrderTraversal(n4);
        for (Integer integer : resultPreOrder) {
            System.out.println(integer);
        }

        System.out.println("Cay n2");
        resultPreOrder = postOrderTraversal(n2);
        for (Integer integer : resultPreOrder) {
            System.out.println(integer);
        }
    }
}
