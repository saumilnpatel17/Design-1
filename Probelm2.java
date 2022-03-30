Time Complexity : O(1) for all the methods: push, pop, top, getMin
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


Your code here along with comments explaining your approach

class MinStack {
    
    Stack<Integer> st;
    Stack<Integer> minSt;
    int min;
    
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
        minSt.push(Integer.MAX_VALUE);
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        st.push(val);
        
        if(val <= minSt.peek()){
            minSt.push(val);
            min = val;
        }
    }
    
    public void pop() {
        if(st.pop() == min){
            minSt.pop();
            min = minSt.peek();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
