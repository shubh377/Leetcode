class Solution {
    public String longestPrefix(String s) {
        
        
        int n=s.length();
        int[] lps=new int[n];
        
        computelps(s,n,lps);
    
        return s.substring(0, lps[s.length() - 1]);
        
        
    }
    
    public static void computelps(String s,int n,int[] lps){
        
        int i=0;
        int j=1;
        
        lps[0]=0;
        
        while (j<n){
            
            if (s.charAt(i)==s.charAt(j)){
                i++;
                lps[j]=i;
                j++;
            }
            else{
                if (i==0){
                    lps[j]=0;
                    j++;
                }
                else{
                    i=lps[i-1];
                }
            }
        }
    }
}