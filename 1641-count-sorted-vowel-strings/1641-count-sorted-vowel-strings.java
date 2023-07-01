class Solution {
    public int countVowelStrings(int n) {
        
        int[][] dp=new int[n][5];
        
        for (int i=0;i<5;i++){
            
            if (i==0){
                dp[0][i]=1;
            }
            else{
                dp[0][i]=dp[0][i-1]+1;
            }
        }
        
        for (int i=1;i<n;i++){
            
            for (int j=0;j<5;j++){
                
                if (j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        
        return dp[n-1][4];
        
    }
}