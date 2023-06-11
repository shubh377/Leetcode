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
    
    public static void Inorder(TreeNode root, List<Integer> temp){
        if (root==null){
            return;
        }
        
        Inorder(root.left,temp);
        temp.add(root.val);
        Inorder(root.right,temp);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Inorder(root,list);
        return list;
    }
}