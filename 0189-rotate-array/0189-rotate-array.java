class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length<=1){
            return;
        }
        
        int steps=k%nums.length;
        
        int gcd=findgcd(nums.length,steps);
        int position,count;
        
        for (int i=0;i<gcd;i++){
            position=i;count=nums.length/gcd-1;
            
            for (int j=0;j<count;j++){
                position=(position+steps)%nums.length;
                
                nums[i]^=nums[position];
                nums[position]^=nums[i];
                nums[i] ^=nums[position];
            }
        }
    }
    
    public int findgcd(int a,int b){
        return (a==0 || b==0) ? a+b: findgcd(b,a%b);
    }
}