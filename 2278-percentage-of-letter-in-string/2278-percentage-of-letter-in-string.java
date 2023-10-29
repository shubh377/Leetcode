class Solution {
    public int percentageLetter(String s, char letter) {
        
        int n=0;
        
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==letter){
                n++;
            }
        }
        
        
        float ans=n*100/s.length();
        return (int)ans;
        
    }
}