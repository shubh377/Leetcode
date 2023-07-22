class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int[][] dp=new int[n][m];
        
        for (int j=0;j<m;j++){
            dp[n-1][j]=matrix[n-1][j];
        }
        
        for (int i=n-2;i>=0;i--){
            
            for (int j=0;j<m;j++){
                
                if (j==0){
                    dp[i][j]=matrix[i][j]+Math.min(dp[i+1][j],dp[i+1][j+1]);
                }
                else if (j==m-1){
                    dp[i][j]=matrix[i][j]+Math.min(dp[i+1][j-1],dp[i+1][j]);
                }
                else{
                    dp[i][j]=matrix[i][j]+Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i+1][j-1]));
                }
            }
        }
        
        int ans=Integer.MAX_VALUE;
        
        for (int j=0;j<m;j++){
            if (dp[0][j]<ans){
                ans=dp[0][j];
            }
        }
        
        
        return ans;
    }
}