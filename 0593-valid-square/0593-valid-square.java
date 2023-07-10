class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        Set<Integer> set=new HashSet<>();
        
        set.add(dist(p1,p2));
        set.add(dist(p1,p3));
        set.add(dist(p1,p4));
        set.add(dist(p2,p3));
        set.add(dist(p2,p4));
        set.add(dist(p3,p4));
        
        if (set.contains(0) || set.size()!=2){
            
            return false;
        }
        
        return true;
        
    }
    
    public static int dist(int[] p1, int[]p2){
        
        return (p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
    } 
}