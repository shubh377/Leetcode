class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        gencom(list,curr,target,candidates,0);
        
        return list;
    }
    
    public void gencom( List<List<Integer>> list,List<Integer> curr,int target,int[] arr,int start){
        
        if (target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        
        if (target<0){
            return;
        }
        
        for (int i=start;i<arr.length;i++){
            
            curr.add(arr[i]);
            gencom(list,curr,target-arr[i],arr,i);
            curr.remove(curr.size()-1);
        }
    }
}