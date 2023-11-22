class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int n=nums.length;
        
        int left=Integer.MAX_VALUE;
        int max=Integer.MAX_VALUE;
        
        for (int i=0;i<n;i++){
            
            if (nums[i]<=left){
                left=nums[i];
            }
            else if (nums[i]<=max){
                max=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}