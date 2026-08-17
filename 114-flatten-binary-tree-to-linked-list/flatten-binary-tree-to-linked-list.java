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
    public void preorder(ArrayList<TreeNode> arr,TreeNode root){
        if(root==null) return;
        arr.add(root);
        preorder(arr,root.left);
        preorder(arr,root.right);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode> arr = new ArrayList<>();

        preorder(arr,root);

        for(int i = 0;i<arr.size()-1;i++){
            TreeNode curr = arr.get(i);
            TreeNode next = arr.get(i + 1);

            curr.left = null;
            curr.right = next;
        }

        TreeNode last = arr.get(arr.size() - 1);
        last.left = null;
        last.right = null;
    }
}