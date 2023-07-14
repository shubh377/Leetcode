/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        if (root==null){
            return new ArrayList<>();
        }
        
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        
        q.add(root);
        
        while (q.size()>0){
            
            int count=q.size();
            
            for (int i=0;i<count;i++){
                TreeNode top=q.poll();
                
                if (top.left!=null){
                    q.add(top.left);
                    map.put(top.left.val,top);
                }
                
                if (top.right!=null){
                    q.add(top.right);
                    map.put(top.right.val,top);
                }
            }
        }
        
        HashMap<Integer,Integer> visited=new HashMap<>();
        q.add(target);
        
        while (k>0 && q.size()>0){
            
            int count=q.size();
            
            for (int i=0;i<count;i++){
                TreeNode top=q.poll();
                visited.put(top.val,1);

                if (top.left!=null && !visited.containsKey(top.left.val)){
                    q.add(top.left);
                }

                if (top.right!=null && !visited.containsKey(top.right.val)){
                    q.add(top.right);
                }

                if (map.containsKey(top.val) && !visited.containsKey(map.get(top.val).val)){
                    q.add(map.get(top.val));
                }
            }
            k--;
            
        }
        
        while (q.size()>0){
            list.add(q.poll().val);
        }
        
        return list;
        
    }
}