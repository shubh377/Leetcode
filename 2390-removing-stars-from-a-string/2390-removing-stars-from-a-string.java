class Solution {
    public String removeStars(String s) {
        
        int n=s.length();
        Stack<Character> st=new Stack<>();
        
        for (int i=0;i<n;i++){
            
            if (i==0){
                
                if (s.charAt(i)!='*'){
                    st.push(s.charAt(i));
                }
            }
            
            else{
                
                if (s.charAt(i)=='*'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        
        String ans="";
        
        while (!st.empty()){
            ans=st.pop() + ans;
        }
        
        return ans;
    }
}