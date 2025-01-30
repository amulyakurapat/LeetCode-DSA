class MyQueue {
   
     Stack<Integer> st = new Stack<> ();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        Stack<Integer> tm = new Stack<> ();
        while(!st.empty()){
            tm.push(st.pop()); //transfer
        }
        st.push(x); //pushing new element
        while(!tm.empty()){
            st.push(tm.pop()); //re transfering 
        }
            }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
       return st.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */