class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        int len=0;
        for (int g=0;g<n;g++){
            
            for (int i=0,j=g;j<n;j++,i++){
                
                if (g==0){
                    dp[i][j]=true;
                }
                else if (g==1){
                    if (s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }
                }
                else{
                   if (s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
                
                if (dp[i][j]==true){
                    len=g+1;
                }
            }
        }
        int first=0;
        int second=0;
        
        for (int i=0,j=len-1;j<n;j++,i++){
            if (dp[i][j]==true){
                first=i;
                second=j;
            }
        }
        
        return s.substring(first,second+1);
    }
}