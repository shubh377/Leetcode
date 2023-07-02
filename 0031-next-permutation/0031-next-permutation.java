class Solution {
    
    
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        
        int ind=-1;
        
        for (int i=n-2;i>=0;i--){
            
            if (nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        
        
        for (int i=n-1;i>=0 && ind!=-1;i--){
            if (nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                
                break;
            }
        }
        
        int j=ind+1;
        int k=n-1;
        
        while (j<k){
            int val=nums[j];
            nums[j]=nums[k];
            nums[k]=val;
            j++;
            k--;
        }
        
    }
}