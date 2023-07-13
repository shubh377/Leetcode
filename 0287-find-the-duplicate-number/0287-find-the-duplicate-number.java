class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                ans=nums[i];
                break;
            }
        }
        return ans;
//         int ans=0;
//         for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            
//             if (entry.getValue()>1){
//                  ans=entry.getKey();
//                 break;
//             }
//         }
//         return ans;
    }
}