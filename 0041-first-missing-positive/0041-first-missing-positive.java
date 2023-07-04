class Solution {
    public int firstMissingPositive(int[] nums) {
        
        
        Arrays.sort(nums);
        int n=nums.length;
        
        int i=1;
        
        for (int j=0;j<n;j++){
            
            if (nums[j]==i){
                i++;
            }
        }
        
        return i;
            
            
    }
}