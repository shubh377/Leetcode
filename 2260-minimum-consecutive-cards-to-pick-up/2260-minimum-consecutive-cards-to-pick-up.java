class Solution {
    public int minimumCardPickup(int[] cards) {
        
        int n=cards.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int min1=0;
        int min=Integer.MAX_VALUE;
        int val=0;
        
        for(int i=0;i<n;i++){
            
            if (!map.containsKey(cards[i])){
                map.put(cards[i],i);
            }
            else{
                val=map.get(cards[i]);
                min1=i-val+1;
                min=Math.min(min,min1);
                map.put(cards[i],i);
            }
        }
        
        if (min1==0){
            return -1;
        }
        
        return min;
    }
}