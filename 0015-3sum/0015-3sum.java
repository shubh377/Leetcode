class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> ans=new ArrayList<>();
//         Arrays.sort(nums);
        
//         int n=nums.length;
        
//         if (n<3){
//             return ans;
//         }
        
//         for (int i=0;i<n-2;i++){
            
//             int j=i+1;
//             int k=n-1;
            
//             while (j<k){
                
//                 if (nums[i]+nums[j]+nums[k]==0){
//                     List<Integer> temp=new ArrayList<>();
//                     temp.add(nums[i]);
//                     temp.add(nums[j]);
//                     temp.add(nums[k]);
                    
//                     if (ans.contains(temp)==false){
//                         ans.add(temp);
//                     }
                    
//                     j++;
//                     k--;
//                 }
//                 else if ((nums[i]+nums[j]+nums[k])>0){
//                     k--;
//                 }
//                 else{
//                     j++;
//                 }
                
//             }
            
//         }
        
//         return ans;
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);
    }
}