class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        
        List<Integer> curr=new ArrayList<>();
        
        gencom(list,curr,target,candidates,0);
        
        return list;
        
    }
    
    public void gencom(List<List<Integer>> list, List<Integer> curr,int target,int[] candidates,int start){
        
        if (target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        
        if (target<0){
            return;
        }
        
        
        for (int i=start;i<candidates.length;i++){
            if (i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            curr.add(candidates[i]);
            gencom(list,curr,target-candidates[i],candidates,i+1);
            curr.remove(curr.size()-1);
        }
    }
}