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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans=new ArrayList<>();
        
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        
        while (q.size()>0){
            double avg=0;
            double sum=0;
            int count=q.size();
            for(int i=0;i<count;i++){
                root=q.poll();
                sum+=(double)root.val;
                
                if (root.left!=null){
                    q.add(root.left);
                }
            
                if (root.right!=null){
                    q.add(root.right);
                }
            }
            avg=sum/count;
            ans.add(avg);
            
        }
        
        return ans;
        
    }
}