class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int[][] dp=new int[n][m];
        int max=Integer.MIN_VALUE;
        
        for (int i=n-1;i>=0;i--){
            for (int j=m-1;j>=0;j--){
                
                if (matrix[i][j]=='0'){
                    dp[i][j]=0;
                }
                else{
                    if (i==n-1){
                        if (matrix[i][j]=='1'){
                            dp[i][j]=1;
                        }
                    }
                    else if (j==m-1){
                        if (matrix[i][j]=='1'){
                            dp[i][j]=1;
                        }
                    }
                    else{
                        dp[i][j]=Math.min(dp[i+1][j],Math.min(dp[i+1][j+1],dp[i][j+1]))+1;
                    }
                }
                
            }
            

        }
        for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    if (dp[i][j]>max){
                        max=dp[i][j];
                    }
                }
            }
        
        return (max)*(max);
        
    }
    
} 