class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
       Set<String> words=new HashSet(wordDict);
        boolean check[]=new boolean[s.length()+1];
        check[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(check[j]&&words.contains(s.substring(j,i)))
                {
                    check[i]=true;
                     break;
                }    
               
            }
        }
        return check[s.length()];
    }
}