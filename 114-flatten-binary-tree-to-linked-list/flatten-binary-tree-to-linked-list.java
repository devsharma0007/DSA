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
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode> arr = new ArrayList<>();
        preorder(root,arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            TreeNode curr = arr.get(i);
            TreeNode next = arr.get(i + 1);

            curr.left = null;
            curr.right = next;
        }

        // Last node
        TreeNode last = arr.get(arr.size() - 1);
        last.left = null;
        last.right = null;
        
        
    }
    public void preorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null) return;
        arr.add(root);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }

}