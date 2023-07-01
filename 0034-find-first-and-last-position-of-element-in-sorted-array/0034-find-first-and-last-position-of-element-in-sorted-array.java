class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int l=nums.length;
        int i=0;
        int j=l-1;
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        
        
        while (i<l){
            
            if (nums[i]==target && arr[0]==-1){
                arr[0]=i;
            }
            
            if (nums[j]==target && arr[1]==-1){
                arr[1]=j;
            }
            
            i++;
            j--;
        }
        
        return arr;
    }
}