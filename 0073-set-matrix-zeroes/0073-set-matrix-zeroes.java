class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        HashSet<Integer> setr=new HashSet<>();
        HashSet<Integer> setc=new HashSet<>();
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    setr.add(i);
                    setc.add(j);
                }
            }
        }
        
        for (int it : setr){
            
            for (int j=0;j<m;j++){
                matrix[it][j]=0;
            }
        }
        
        for (int it : setc){
            
            for (int i=0;i<n;i++){
                matrix[i][it]=0;
            }
        }
        
        
    }
}