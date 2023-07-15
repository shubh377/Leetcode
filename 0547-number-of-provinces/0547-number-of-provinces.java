class Solution {
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int node){
        
        vis[node]=true;
        
        for (int it: adj.get(node)){
            if (!vis[it]){
                dfs(adj,vis,it);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        
        int n=isConnected.length;
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for (int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        boolean[] vis=new boolean[n];
        int cnt=0;
        
        for (int i=0;i<n;i++){
            if (!vis[i]){
                cnt++;
                dfs(adj,vis,i);
            }
        }
        
        return cnt;
    }
}