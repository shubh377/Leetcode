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
    public static void Postorder(TreeNode root, List<Integer> temp){
        if (root==null){
            return;
        }
        
        Postorder(root.left,temp);
        Postorder(root.right,temp);
        temp.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Postorder(root,list);
        return list;
    }
}