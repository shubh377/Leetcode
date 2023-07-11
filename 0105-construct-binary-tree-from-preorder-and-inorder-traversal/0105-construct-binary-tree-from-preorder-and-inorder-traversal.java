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
    public static TreeNode ans(int[] pre,int psi,int pei,int[] in,int isi,int iei){
        
        
        if (isi>iei){
            return null;
        }
        
        int idx=isi;
        
        while (in[idx]!=pre[psi]){
            idx++;
        }
        
        int l=idx-isi;
        
        TreeNode root=new TreeNode(pre[psi]);
        
        root.left=ans(pre,psi+1,psi+l,in,isi,idx-1);
        root.right=ans(pre,psi+l+1,pei,in,idx+1,iei);
        
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        
        return ans(preorder,0,n-1,inorder,0,n-1);
    }
}