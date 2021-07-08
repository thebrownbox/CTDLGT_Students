public class Sample {

    public static void printTree(TreeNode root){
        // 1. Bai toan co so
        if(root == null)
            return;
        
        // 2. Cong thuc de quy
        // 2.1 Cong viec thuc hien taij vong lap hien tai
        System.out.print(root.val + " ");
        // 2.2 Cong thuc de quy
        printTree(root.left);
        printTree(root.right);
        //Hung, Tien : 1 2 4 5 3 6
        // Hung, Tin: 1 2 3 4 5 6
    }

    //** Them node val vao cay root */
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        // 1. DK co so
        if (root == null) {
            return new TreeNode(val);
        }

        // 2. De quy
        if (val > root.val) {

            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                insertIntoBST(root.right, val);
            }

        } else if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                insertIntoBST(root.left, val);
            }
        }
        return root;
    }


    public TreeNode searchBST(TreeNode curNode, int val) {
        // TH co so:
        if(curNode == null){
            return null;
        }
        TreeNode resultNode = null;
        // 2. cong viec chinh
        // 2.1 Xu ly voi node hien tai
        if(val == curNode.val){
            return curNode;
        }else{
            // 2.2 Goi de quy den bai toan nho hon
            if(val > curNode.val){ // Di ve ben phai
                return searchBST(curNode.right, val);
            }else{ // Di ve ben trai
                // Di tim val ow ben trai cua curNode
                resultNode = searchBST(curNode.left, val);
            }
        }
        
        return resultNode;
    }


    // Tinh chieu cao cua cay
    public int maxDepth(TreeNode curNode) {
        // 1. THCS
        if(curNode == null){
            return 0;
        }

        // 2. 
        // 2.1 Thuc hien cong viec tai node hien tai
        // Tinh chieu cao cay con ben trai
        int leftHight = 1 + maxDepth(curNode.left);
        int rightHight = 1 + maxDepth(curNode.right);
        return Math.max(leftHight, rightHight);
    }





    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        root.left = n2;
        root.right = n3;

        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        root = insertIntoBST(root, 7);
        printTree(root);
    }
}
