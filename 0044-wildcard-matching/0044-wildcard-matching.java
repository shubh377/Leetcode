class Solution {
    public boolean isMatch(String s, String p) {
        
        int n=p.length();
        int m=s.length();
        
        int[][] dp=new int[n][m];
        
        for (int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        
        return find(n-1,m-1,s,p,dp);
    }
    
    public boolean find(int i,int j,String s,String p,int[][] dp){
        
        if (i<0 && j<0){
            return true;
        }
        
        if (i<0 && j>=0){
            return false;
        }
        
        if (j<0 && i>=0){
            
            for (int k=0;k<=i;k++){
                if (p.charAt(k)!='*'){
                    return false;
                }
            }
            return true;
        }
        
        if (dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        
        boolean result=false;
        if (p.charAt(i)==s.charAt(j) || p.charAt(i)=='?'){
            result=find(i-1,j-1,s,p,dp);
        }
        
        if (p.charAt(i)=='*'){
            
            result=find(i-1,j,s,p,dp) || find(i,j-1,s,p,dp);
        }
        
        dp[i][j]=result ? 1:0;
        return result;
    }
}