package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Quang_429 {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.children = new ArrayList<>();
        n1.children.add(n2);
        n1.children.add(n3);
        n1.children.add(n4);

        n3.children = new ArrayList<>();
        n3.children.add(n5);
        n3.children.add(n6);

        List<List<Integer>> list = levelOrder(n1);
        for(int i=0;i<list.size();i++){
            for(Integer l: list.get(i))
                System.out.print(l + " ");
            System.out.println();
        }

    }

    public static List<List<Integer>> levelOrder(Node root){
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (true){
            int nodeCount = queue.size();
            if(nodeCount==0)
                break;
            List<Integer> orderList = new ArrayList<>();
            while(nodeCount>0){
                Node node = queue.poll();
                orderList.add(node.val);
                if(node.children!=null){
                    for(var child:node.children)
                        queue.add(child);
                }
                nodeCount--;
            }
            list.add(orderList);
        }
        return list;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
