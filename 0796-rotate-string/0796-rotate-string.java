class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length()!=goal.length()){
            return false;
        }
        
        else if ((goal+goal).indexOf(s)==-1){
            return false;
        }
        
        return true;
    }
}