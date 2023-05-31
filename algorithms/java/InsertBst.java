//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }

        TreeNode parent = null;
        TreeNode temp = root;
        while(temp != null){
            parent = temp;
            
            if(temp.val < val){
                temp = temp.right;
            }
            else if(temp.val > val){
                temp = temp.left;
            }
        }

        TreeNode newNode = new TreeNode(val);
        if(parent.val < val){
            parent.right = newNode;
        }
        else if(parent.val > val){
            parent.left = newNode;
        }

        return root;
    }
}
