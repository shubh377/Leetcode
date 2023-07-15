class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        
        int mpist=0;
        int lsf=prices[0];
        int[] dpl=new int[n];
        
        for (int i=1;i<n;i++){
            
            if (prices[i]<lsf){
                lsf=prices[i];
            }
            
            mpist=prices[i]-lsf;
            
            if (mpist>dpl[i-1]){
                dpl[i]=mpist;
            }
            else{
                dpl[i]=dpl[i-1];
            }
        }
        
        int mpibt=0;
        int msf=prices[n-1];
        int[] dpr=new int[n];
        
        for (int i=n-2;i>=0;i--){
            
            if (prices[i]>msf){
                msf=prices[i];
            }
            
            mpibt=msf-prices[i];
            
            if (mpibt>dpr[i+1]){
                dpr[i]=mpibt;
            }
            else{
                dpr[i]=dpr[i+1];
            }
        }
        
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (dpl[i]+dpr[i]>ans){
                ans=dpl[i]+dpr[i];
            }
        }
        
        return ans;
    }
}