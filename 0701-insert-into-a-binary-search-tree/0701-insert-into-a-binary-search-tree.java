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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode node=new TreeNode(val);
        
        if (root==null){
            root=node;
            return node;
        }
        
        TreeNode prev=null;
        TreeNode temp=root;
        
        while (temp!=null){
            if (temp.val>val){
               prev=temp;
               temp=temp.left;
            }
            
            else if (temp.val<val){
                prev=temp;
                temp=temp.right;
            }
        }
        
        if (prev.val>val){
            prev.left=node;
        }
        else{
            prev.right=node;
        }
        
        return root;
    }
}