class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        for (int i=0;i<n;i++){
            
            int j=0;
            int k=m-1;
            
            while (j<=k){
                
                int mid=(k+j)/2;
                
                if (matrix[i][mid]==target){
                    return true;
                }
                else if (matrix[i][mid]<target){
                    j=mid+1;
                }
                else{
                    k=mid-1;
                }
            }
        }
        
        return false;
        
    }
}