class Solution {
    public int maxProduct(int[] nums) {
        
        int max=nums[0];
        int min=nums[0];
        int maxsf=nums[0];
        int minsf=nums[0];
        
        int ans=nums[0];
        
        for (int i=1;i<nums.length;i++){
            
            if (nums[i]<0){
                max=Math.max(nums[i],minsf*nums[i]);
                min=Math.min(nums[i],maxsf*nums[i]);
            }
            else{
                max=Math.max(nums[i],maxsf*nums[i]);
                min=Math.min(nums[i],minsf*nums[i]);
            }
            maxsf=max;
            minsf=min;
            ans=Math.max(ans,maxsf);
        }
        
        return ans;
    }
}