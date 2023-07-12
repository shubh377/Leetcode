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
    
    public static TreeNode ans(int[] preorder,int psi,int pei,int[] inorder,int isi,int iei){
        
        if (isi>iei){
            return null;
        }
        
        int idx=isi;
        while (inorder[idx]!=preorder[pei]){
            idx++;
        }
        
        int l=idx-isi;
        
        TreeNode root=new TreeNode(preorder[pei]);
        
        root.left=ans(preorder,psi,psi+l-1,inorder,isi,idx-1);
        root.right=ans(preorder,psi+l,pei-1,inorder,idx+1,iei);
        
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n=inorder.length;
        
        return ans(postorder,0,n-1,inorder,0,n-1);
    }
}