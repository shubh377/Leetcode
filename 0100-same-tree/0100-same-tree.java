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
    
    public static List<Integer> levelorder(TreeNode root){
        
        List<Integer> temp=new ArrayList<>();
        
        if (root==null){
            return temp;
        }
        
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        
        while (q.size()>0){
            int count=q.size();
            for (int i=0;i<count;i++){
                root=q.remove();
                temp.add(root.val);
                
                if (root.left!=null){
                    q.add(root.left);
                }
                else{
                    temp.add(0);
                }
                
                if (root.right!=null){
                    q.add(root.right);
                }
                else{
                    temp.add(0);
                }
            }
        }
        
        return temp;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p==null && q== null){
            return true;
        }
        
        if (p==null || q==null){
            return false;
        }
        
        if (p.val==q.val){
            return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
        
        return false;

    }
}    
    