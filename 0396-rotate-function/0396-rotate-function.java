class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int n=nums.length;
        
        int v=0;
        int sum=0;
        int val=Integer.MIN_VALUE;
        
        for (int i=0;i<n;i++){
            sum+=nums[i];
            v+=nums[i]*i;
        }
        
        
        for (int i=n-1;i>=0;i--){
            int ans=(v+sum)- (n*nums[i]);
            v=ans;
            val=Math.max(val,ans);
        }
        
        return val;
    }
}