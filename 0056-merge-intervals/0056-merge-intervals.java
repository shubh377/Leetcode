class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> st=new Stack<>();
        int n=intervals.length;
        st.push(intervals[0]);
        
        for (int i=1;i<n;i++){
            
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            
            int[] popp=st.pop();
            
            int start1=popp[0];
            int end1=popp[1];
            
            int max=Math.max(end1,end2);
            if (end1>=start2){
                int[] in=new int[2];
                in[0]=start1;
                in[1]=max;
                
                st.push(in);
            }
            else{
                st.push(popp);
                st.push(intervals[i]);
            }
            
        }
        
        int[][] output=new int[st.size()][2];
        
        for (int i=output.length-1;i>=0;i--){
            output[i]=st.pop();
        }
        return output;
    }
}