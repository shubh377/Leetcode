class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        int sol=recur(nums,target,dp);
        
        return sol;
    }
    
    public int recur(int[] nums,int target,int[] dp){
        
        if (target<0){
            return 0;
        }
        
        if (target==0){
            return 1;
        }
        
        if (dp[target]!=-1){
            return dp[target];
        }
        
        int count=0;
        for (int i=0;i<nums.length;i++){
            count+=recur(nums,target-nums[i],dp);
        }
        
        dp[target]=count;
        return dp[target];
    }
}