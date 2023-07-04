class Solution {
    public int singleNumber(int[] nums) {
        
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for (int e : nums){
            
            if (!map.containsKey(e)){
                map.put(e,1);
            }
            else{
                map.put(e,map.get(e)+1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}