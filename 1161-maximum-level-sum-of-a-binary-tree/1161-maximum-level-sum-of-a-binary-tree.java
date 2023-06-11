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
    
    public static void levelorder(TreeNode root,List<Integer> list){
        
        if (root==null){
            return;
        }
        
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        
        while (mq.size()>0){
            int count=mq.size();
            int sum=0;
            
            for (int i=0;i<count;i++){
                root=mq.remove();
                sum+=root.val;
                
                if (root.left!=null){
                    mq.add(root.left);
                }
                
                if (root.right!=null){
                    mq.add(root.right);
                }
            }
            list.add(sum);

        }
    }
    
    public int maxLevelSum(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        levelorder(root,list);
        int value=Collections.max(list);
        int ans=list.indexOf(value);
        return ans+1;
        
    }
}