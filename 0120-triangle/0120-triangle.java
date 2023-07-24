class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        
        int[][] dp=new int[m][n];
        
        for (int[] arr: dp){
            
            Arrays.fill(arr,-1);
        }
        
        int ans=find(triangle,0,0,dp);
        return ans;
    }
    
    public static int find(List<List<Integer>> t,int i,int j,int[][] dp){
        
        if (i==t.size()-1){
            return t.get(i).get(j);
        }
        
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int left=find(t,i+1,j,dp)+t.get(i).get(j);
        int right=find(t,i+1,j+1,dp)+t.get(i).get(j);
        
        dp[i][j]=Math.min(left,right);
        return dp[i][j];
    }
}