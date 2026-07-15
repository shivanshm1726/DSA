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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
            // leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // single child
            if(root.left == null){
                return root.right;
            }

            if(root.right == null){
                return root.left;
            }

            // two children

            TreeNode node = predecessor(root.left);
            root.val = node.val;
            root.left = deleteNode(root.left, node.val);
        }
        return root;
    }

    public TreeNode predecessor(TreeNode node){
        while(node.right != null){
            node = node.right;
        }
        return node;
    }
}