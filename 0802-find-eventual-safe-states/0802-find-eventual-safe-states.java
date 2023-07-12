class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       
       int v=graph.length; 
        List<List<Integer>> graphrev=new ArrayList<>();
        
        for (int i=0;i<v;i++){
            graphrev.add(new ArrayList<>());
        }
        
        int[] indegree=new int[v];
        
        for (int i=0;i<v;i++){
            
            for (int it: graph[i]){
                graphrev.get(it).add(i);
                indegree[i]++;
            }
        }
        
        Queue<Integer> q=new ArrayDeque<>();
        List<Integer> safe=new ArrayList<>();
        
        for (int i=0;i<v;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        while (q.size()>0){
            
            int node=q.poll();
            safe.add(node);
            
            for (int it: graphrev.get(node)){
                indegree[it]--;
                if (indegree[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(safe);
        return safe;
    }
}