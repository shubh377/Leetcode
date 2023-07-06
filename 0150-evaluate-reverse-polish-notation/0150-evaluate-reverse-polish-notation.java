class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        
        for (String s: tokens){
            
            if (s.equals("+")){
                
                int a=(st.pop());
                int b=(st.pop());
                st.push((a+b));
            }
            
            else if (s.equals("-")){
                
                int a=(st.pop());
                int b=(st.pop());
                st.push((b-a));
            }
            
            else if (s.equals("/")){
                
                int a=(st.pop());
                int b=(st.pop());
                st.push((b/a));
            }
            
            else if (s.equals("*")){
                
                int a=(st.pop());
                int b=(st.pop());
                st.push((a*b));
            }
            else{
                
                st.push(Integer.parseInt(s));
            }
            
            
        }
        
        return (st.pop());
        
    }
}