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
    public static void Preorder(TreeNode root, List<Integer> temp){
        if (root==null){
            return;
        }
        temp.add(root.val);
        Preorder(root.left,temp);
        Preorder(root.right,temp);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Preorder(root,list);
        return list;
    }
}