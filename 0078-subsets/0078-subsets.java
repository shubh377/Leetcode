class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        find(0,nums,curr,ans);
        return ans;
        
    }
    
    public void find(int ind,int[] nums,List<Integer> curr,List<List<Integer>> ans ){
        
            
        if (ind==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        } 
                
        curr.add(nums[ind]);
        find(ind+1,nums,curr,ans);
        curr.remove(curr.size()-1);
        find(ind+1,nums,curr,ans);
    }
}