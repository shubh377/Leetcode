class Solution {
    
    
        List<Integer> [] adj;
        boolean[] visited;
        boolean[] marked;
        
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
       adj=new ArrayList[numCourses];
        
        for (int i=0;i<numCourses;i++){
            
            adj[i]=new ArrayList<>();
        }
        
        visited=new boolean[numCourses];
        marked=new boolean[numCourses];
        
        for (int i=0;i<prerequisites.length;i++){
            
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        
        
        for (int i=0;i<numCourses;i++){
            
            if (!visited[i]){
                if (cyclic(i)){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    boolean cyclic(int i){
        
        visited[i]=true;
        
        for (int j:adj[i]){
            if (!visited[j]){
                if (cyclic(j)){
                    return true;
                }
            }
            else if (!marked[j]){
                return true;
            }
        }
        marked[i]=true;
        return false;
    }
}