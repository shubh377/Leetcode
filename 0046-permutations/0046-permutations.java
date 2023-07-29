class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        
        boolean[] freq=new boolean[nums.length];
        find(nums,curr,ans,freq);
        return ans;
    }
    
    public static void find(int[] nums,List<Integer> curr,List<List<Integer>> ans,boolean[] freq){
        
        if (curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i=0;i<nums.length;i++){
            
            if (!freq[i]){
                freq[i]=true;
                curr.add(nums[i]);
                find(nums,curr,ans,freq);
                curr.remove(curr.size()-1);
                freq[i]=false;
            }
        }
    }
}