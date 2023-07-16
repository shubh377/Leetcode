class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
        Stack<Integer> stneg=new Stack<>();
        Stack<Integer> stpos=new Stack<>();
        
        for (int i=0;i<n;i++){
            
            if (nums[i]<0){
                stneg.push(nums[i]);
            }
            else{
                stpos.push(nums[i]);
            }
        }
        
        int k=n-1;
        int j=n-2;
        
        while (!stneg.isEmpty()){
            
            int first=stneg.pop();
            int second=stpos.pop();
            
            nums[k]=first;
            nums[j]=second;
            
            k-=2;
            j-=2;
        }
        
        return nums;
    }
}