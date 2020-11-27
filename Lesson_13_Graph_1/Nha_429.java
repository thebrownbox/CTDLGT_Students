/*
// Definition for a Node.
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
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        
        if (root != null){
            List<Integer> firstList = new ArrayList<Integer>();
            firstList.add(root.val);
            finalList.add(firstList);
            
            List<Node> curList = new ArrayList<Node>();
            curList.add(root);
            
            while(!curList.isEmpty()){
                List<Node> listNode = new ArrayList<Node>();
                List<Integer> listInteger = new ArrayList<Integer>();
                
                for (Node node : curList){
                    if (!node.children.isEmpty()){
                        for (Node nodeChild : node.children){
                            listNode.add(nodeChild);
                            listInteger.add(nodeChild.val);
                        }
                    }
                }
                
                if (!listNode.isEmpty()){
                    finalList.add(listInteger);
                }
                curList = listNode;
            }
        }
        
        return finalList;
    }
}