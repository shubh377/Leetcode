class StockSpanner {
    
    
    Stack<int[]> st;
    
    public StockSpanner() {
        this.st=new Stack<>();
    }
    
    public int next(int price) {
        
        int span=1;
        
        while (st.size()>0 && price>=st.peek()[0]){
            span+=st.peek()[1];
            st.pop();
        }
        
        st.push(new int[]{price,span});
        
        return span;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */