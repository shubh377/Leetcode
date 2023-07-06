class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
         List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        generatecombination(1,9,curr,ans,k,n);

        return ans;
    }

    public void generatecombination(int start,int end,ArrayList<Integer> curr, List<List<Integer>> ans,int k, int target){

        if(target == 0 && curr.size() == k){
            ans.add(new ArrayList(curr));
        }

        
        for(int i = start; i <= end; i++){
            curr.add(i);

            generatecombination(i+1, end, curr,ans,k,target-i);

            curr.remove(curr.size() - 1);
        }
    }
}