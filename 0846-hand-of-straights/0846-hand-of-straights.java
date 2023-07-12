class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        for (int i=0;i<hand.length;i++){
            if (!map.containsKey(hand[i])){
                map.put(hand[i],1);
            }else{
                
                map.put(hand[i],map.get(hand[i])+1);
            }
        }
        
        while (map.size()>0){
            int first=map.firstKey();
            
            for (int i=first;i<first+groupSize;i++){
                if (!map.containsKey(i)){
                    return false;
                }
                int count=map.get(i);
                if (count==1){
                    map.remove(i);
                }
                else{
                    map.put(i,map.get(i)-1);
                }
            }
        }
        return true;
    }
}