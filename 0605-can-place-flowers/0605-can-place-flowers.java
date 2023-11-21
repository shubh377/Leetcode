class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
       int count=0;
        if(flowerbed.length==1 && flowerbed[0]==0 && (n==1||n==0))
        return true;
        for(int index=0;index<flowerbed.length;index++){
            if(flowerbed[index]==1){
                continue;
            }
            if(index==0){
                if(flowerbed[index+1]==0){
                    flowerbed[index]=1;
                    count++;
                    continue;
                }                
            }            
            else if(index==flowerbed.length-1){
                if(flowerbed[index-1]==0){
                    flowerbed[index]=1;
                    count++;
                    continue;
                }                
            }            
            else if(flowerbed[index-1]==0 ){
                if(flowerbed[index+1]==0){
                    flowerbed[index]=1;
                    count++;
                    continue;
                }
                
            }  
        }
        System.out.println(count);
        return count>=n;
    }
}