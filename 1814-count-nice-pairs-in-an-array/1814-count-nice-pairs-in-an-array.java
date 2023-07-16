class Solution {
    public static long reverse(long x){
        
        long a=0;
        while (x>0){
            long d=x%10;
            a=a*10+d;
            x=x/10;
        }
        return a;
    }
    
    public int countNicePairs(int[] nums) {
        
        int n=nums.length;
        HashMap<Long,Integer> map=new HashMap<>();
        int mod=1000000007;
        int ans=0;
        
        for (int i=0;i<n;i++){
            long val=nums[i];
            long rev=reverse(val);
            
            long diff=val-rev;
            
            if (map.containsKey(diff)){
                ans=(ans+map.get(diff))%mod;
            }
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        
        return ans;
    }
}