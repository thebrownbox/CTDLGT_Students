import java.time.DateTimeException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


public class SampleBFS_BT {


    public static void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> daDuyet = new HashSet<>();

        // b1. Add root vao queue
        queue.add(root);
        daDuyet.add(root);
        // System.out.print(root.val + " ");

        while(queue.isEmpty() == false)
        {

            // b2. pop ra khoi quue
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val + " ");
            
            // b3. add cac canh ke
            if(currentNode.left != null && daDuyet.contains(currentNode.left) == false)
            {
                queue.add(currentNode.left);
                daDuyet.add(currentNode.left);
                // System.out.print(currentNode.left.val + " ");
            }

            if(currentNode.right != null && daDuyet.contains(currentNode.right) == false)
            {
                queue.add(currentNode.right);
                daDuyet.add(currentNode.right);
            }
        }
        System.out.println();
    }

    public static void DFS(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> daDuyet = new HashSet<>();

        // b1. Add root vao queue
        stack.add(root);
        daDuyet.add(root);
        // System.out.print(root.val + " ");

        while(stack.isEmpty() == false)
        {

            // b2. pop ra khoi quue
            TreeNode currentNode = stack.pop();
            System.out.print(currentNode.val + " ");
            
            // b3. add cac canh ke
            if(currentNode.right != null && daDuyet.contains(currentNode.right) == false)
            {
                stack.add(currentNode.right);
                daDuyet.add(currentNode.right);
            }

            if(currentNode.left != null && daDuyet.contains(currentNode.left) == false)
            {
                stack.add(currentNode.left);
                daDuyet.add(currentNode.left);
            }

        }  
        System.out.println();
    }


    public static void DFS2(TreeNode curNode)
    {
        if(curNode == null){
            return ;
        }

        // cong thuc
        System.out.print(curNode.val + " ");
        
        // for(TreeNode nodeKe : curNode.neighbors && daDuyet.contain(nodeKe) == false)
        // {
        //     DFS2(nodeKe);
        // }
    }

    public static void main(String[] args) {
        
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n4;
        n2.left = n3;
        n2.right = n5;

        // n4.left = n5;
        n4.right = n6;

        System.out.print("BFS: ");
        BFS(n1);
        System.out.print("DFS: ");
        DFS(n1);

        System.out.print("DFS2: ");
        DFS2(n1);

    }
}
