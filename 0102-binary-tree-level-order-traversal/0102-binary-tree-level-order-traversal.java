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
    
    public static void Levelorder(TreeNode root, List<List<Integer>> temp){
        if (root==null){
            return;
        }
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        
        while (mq.size()>0){
            int count=mq.size();
            List<Integer> ans=new ArrayList<>();
            for (int i=0;i<count;i++){
                root=mq.remove();
                ans.add(root.val);
                
                if (root.left!=null){
                    mq.add(root.left);
                }
                if (root.right!=null){
                    mq.add(root.right);
                }
            }
            temp.add(ans);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> temp=new ArrayList<>();
        Levelorder(root,temp);
        return temp;
    }
}