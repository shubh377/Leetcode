// class Pair{
    
//     int first;
//     int second;
    
//     Pair(int f,int s){
//         this.first=f;
//         this.second=s;
//     }
// }

// class Solution {
    
//     public static void bfs(int row,int col,boolean[][] vis,char[][] grid){
        
//         vis[row][col]=true;
//         Queue<Pair> q=new ArrayDeque<>();
//         q.add(new Pair(row,col));
//         int n=grid.length;
//         int m=grid[0].length;
        
//         while (q.size()>0){
//             int r=q.peek().first;
//             int c=q.peek().second;
//             q.remove();
            
//             for (int k=-1;k<=1;k++){
//                 for (int l=-1;l<=1;l++){
//                     int nrow=r+k;
//                     int ncol=c+l;
                    
//                     if (nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow]                            [ncol]==false){
//                         vis[nrow][ncol]=true;
//                         q.add(new Pair(nrow,ncol));
//                     }
//                 }
//             }
//         }
//     }
//     public int numIslands(char[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
        
//         int cnt=0;
//         boolean[][] vis=new boolean[n][m];
//         for (int i=0;i<n;i++){
//             for (int j=0;j<m;j++){
                
//                 if(vis[i][j]==false && grid[i][j]=='1'){
//                     cnt++;
//                     bfs(i,j,vis,grid);
//                 }
//             }
//         }
        
//         return cnt;
//     }
// }
class Solution {
    int m,n;
    boolean[][] check;
    public int numIslands(char[][] grid) {
        int count=0;
        this.m=grid.length;
        this.n=grid[0].length;
        this.check=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( check[i][j]==false && grid[i][j] == '1' ){
                    group(grid,i,j);
                    count++;
                }
            }
        }
       return count; 
    }
    public void group( char[][] grid, int i,int j){
        
        if(i<0||i>m-1||j<0||j>n-1||check[i][j]==true||grid[i][j]=='0')
            return;

        check[i][j]=true;
        group(grid,i,j+1);
        group(grid,i+1,j);
        group(grid,i,j-1);
        group(grid,i-1,j);
    }
}

