/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        
        if (root != null){
            List<Integer> firstList = new ArrayList<Integer>();
            firstList.add(root.val);
            finalList.add(firstList);

            List<TreeNode> curList = new ArrayList<TreeNode>();
            curList.add(root);

            while(!curList.isEmpty()){
                List<TreeNode> listTreeNode = new ArrayList<TreeNode>();
                List<Integer> listInteger = new ArrayList<Integer>();

                // System.out.println("Start the list: ");
                for (TreeNode node : curList){
                    // System.out.println(node.val);
                    if (node.left != null){
                        listTreeNode.add(node.left);
                        listInteger.add(node.left.val);
                    }
                    if (node.right != null){
                        listTreeNode.add(node.right);
                        listInteger.add(node.right.val);
                    }
                }

                if (!listTreeNode.isEmpty()){
                    finalList.add(listInteger);
                }
                curList = listTreeNode;
            }
        }

        
        return finalList;
    }
}