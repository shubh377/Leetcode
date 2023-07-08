class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        
        int n=nums.length;
        
        int[] left=new int[nums.length];
        int ans =0;
        left[0]=0;
        for (int i=0;i<nums.length-1;i++){
            ans+=nums[i];
            left[i+1]=ans;
        }
        
        int[] right=new int[nums.length];
        ans=0;
        right[n-1]=0;
        for (int i=n-1;i>0;i--){
            ans+=nums[i];
            right[i-1]=ans;
        }
        
        int[] temp=new int[n];
        
        for (int i=0;i<n;i++){
            temp[i]=Math.abs(left[i]-right[i]);
        }
        
        return temp;
    }
}