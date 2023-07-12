class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        
        gencom(list,curr,k,n,1,9);
        
        return list;
    }
    
    public static void gencom(List<List<Integer>> list,List<Integer> curr,int k,int n,int start,int end){
        
        if (n==0 && curr.size()==k){
            list.add(new ArrayList<>(curr));
        }
        
        for(int i = start; i <= end; i++){
            curr.add(i);
            gencom(list,curr,k,n-i,i+1,end);
            curr.remove(curr.size() - 1);
        }
    }
}