class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        if (nums.length==0){
            return 0;
        }
        
        if (nums.length==1){
            return nums[0];
        }
        
        int[] dp1=new int[nums.length];
        
        dp1[0]=nums[0];
        dp1[1]=Math.max(dp1[0],nums[1]);
        
        
        for (int i=2;i<nums.length-1;i++){
            dp1[i]=Math.max(dp1[i-2]+nums[i],dp1[i-1]);
        }
        
        int[] dp2=new int[nums.length];
        
        dp2[nums.length-1]=nums[nums.length-1];
        dp2[nums.length-2]=Math.max(dp2[nums.length-1],nums[nums.length-2]);
        
        for (int i=n-3;i>0;i--){
            dp2[i]=Math.max(dp2[i+1],dp2[i+2]+nums[i]);
        }
        
        return Math.max(dp1[n-2],dp2[1]);
    }
}