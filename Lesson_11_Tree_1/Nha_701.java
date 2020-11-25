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
    TreeSet<Integer> mySet = new TreeSet<Integer>();
    TreeNode newRoot;
    
    public void addValue(TreeNode curNode){
        if (curNode == null){
            return;
        }
        
        addValue(curNode.left);
        mySet.add(curNode.val);
        addValue(curNode.right);
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        mySet.add(val);
        addValue(root);
        
        TreeNode curNode;
        System.out.println(mySet.size());
        System.out.println(mySet.first());
        System.out.println(mySet.last());
        TreeNode newNode = new TreeNode(mySet.first());
        newRoot = curNode = newNode;
        mySet.remove(mySet.first());
        
        while(!mySet.isEmpty()){
            newNode = new TreeNode(mySet.first());
            curNode.right = newNode;
            curNode = newNode;
            mySet.remove(mySet.first());
        }
        
        return newRoot;
    }
}