class Solution {
    public int maxArea(int[] height) {
        
        int l=0;
        int r=height.length-1;
        
        int max=0;
        
        while (l<r){
            
            int lh=height[l];
            int rh=height[r];
            int area=Math.min(lh,rh)*(r-l);
            max=Math.max(area,max);
            
            if (lh<rh){
                l++;
            }
            else{
                r--;
            }
        }
        
        return max;
        
    }
}