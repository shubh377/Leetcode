class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int l1=word1.length();
        int l2=word2.length();
        
        int i=0;
        int j=0;
        
        while (i<l1 && j<l2){
            ans+=word1.charAt(i);
            ans+=word2.charAt(j);
            i++;
            j++;
        }
        
        while (i<l1){
            ans+=word1.charAt(i);
            i++;
        }
        
        while (j<l2){
            ans+=word2.charAt(j);
            j++;
        }
        
        return ans;
  }
}