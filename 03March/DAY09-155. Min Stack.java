class Pair{
    int val;
    int min;
    Pair(int x, int y){
        this.val = x;
        this.min = y;
    }
}
class MinStack {
    Stack<Pair> st;
    
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if(!st.isEmpty() && st.peek().min < val){
            st.push(new Pair(val,st.peek().min));
        }else{
            st.push(new Pair(val,val));
        }
    }
    
    public void pop() { 
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
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

/*
Time Complexity:
The push, pop, top, and getMin operations all involve stack operations, which generally take O(1) time complexity.
Therefore, all operations (push, pop, top, getMin) have an overall time complexity of O(1).
  
Space Complexity:
The space complexity is O(n), where n is the number of elements stored in the stack.
Each element in the stack consists of two integers (value and minimum), so the space usage scales linearly with the number of elements pushed into the stack.
Additionally, the space usage does not scale with the input size, and the implementation uses only a constant amount of extra space.
Therefore, the overall space complexity is O(n).
  
In summary:
Time Complexity: O(1) for all operations
Space Complexity: O(n)
*/
