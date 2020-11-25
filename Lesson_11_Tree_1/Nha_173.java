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
class BSTIterator {
    Stack<Integer> myStack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushNumber(root);
    }
    
    public void pushNumber(TreeNode curNode){
        if (curNode == null){
            return;
        }
        
        pushNumber(curNode.right);
        myStack.push(curNode.val);
        pushNumber(curNode.left);
    }
    
    /** @return the next smallest number */
    public int next() {
        return myStack.pop();
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !myStack.empty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */