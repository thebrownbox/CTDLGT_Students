package lesson13;

import java.util.*;

public class Quang_102 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        List<List<Integer>> list = levelOrder(n1);
        for(int i=0;i<list.size();i++){
            for(Integer l: list.get(i))
                System.out.print(l + " ");
            System.out.println();
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (true){
            int nodeCount = queue.size();
            if(nodeCount==0)
                break;
            List<Integer> orderList = new ArrayList<>();
            while(nodeCount>0){
                TreeNode node = queue.poll();
                orderList.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                nodeCount--;
            }
            list.add(orderList);
        }
        return list;
    }
}
