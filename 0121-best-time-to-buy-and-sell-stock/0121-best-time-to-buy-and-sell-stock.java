class Solution {
    
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int lsf=Integer.MAX_VALUE;
        int pist=0;
        int op=0;
        
        for (int i=0;i<n;i++){
            
            if (prices[i]<lsf){
                lsf=prices[i];
            }
            
            pist=prices[i]-lsf;
            
            if (pist>op){
                op=pist;
            }
        }
        return op;
    }
}