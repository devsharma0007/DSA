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
 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        if(root==null) return arr;
        Queue<Pair> q = new  LinkedList<>();
        q.add(new Pair(root,0));

        while(q.size()>0){
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;
            if(arr.size()==level){
                arr.add(new ArrayList<>());
            }
            arr.get(level).add(node.val);

            if(node.left!=null){
                q.add(new Pair(node.left,level+1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,level+1));
            }   
        }
        return arr;
        
    }
}