class Solution {
    public int[] singleNumber(int[] nums) {
        
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        
        for (int i=0;i<n;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            if(value==1){
                l.add(entry.getKey());
            }
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
        
        
    }
}