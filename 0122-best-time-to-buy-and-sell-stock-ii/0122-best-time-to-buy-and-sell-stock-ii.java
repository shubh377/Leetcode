class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int bd=0;
        int sd=0;
        int profit=0;
        
        for (int i=1;i<n;i++){
            
            if (prices[i]>prices[i-1]){
                sd++;
            }
            else{
                profit+=prices[sd]-prices[bd];
                bd=i;
                sd=i;
            }
        }
        
        profit+=prices[sd]-prices[bd];
        return profit;
    }
}