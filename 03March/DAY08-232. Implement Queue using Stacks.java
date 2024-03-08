class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
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

/*
Time Complexity:
The push operation involves transferring all elements from st1 to st2, then pushing the new element onto st1, and finally transferring all elements back to st1. These operations involve popping and pushing elements, each of which takes O(1) time complexity in a stack.
Since the push operation involves three sequential stacks operations, its time complexity is O(n), where n is the number of elements in the stack.
The pop, peek, and empty operations are straightforward stack operations and take O(1) time complexity.
Therefore, the time complexity of all operations (push, pop, peek, empty) is O(n).
  
Space Complexity:
The space complexity is O(n), where n is the number of elements stored in the stacks st1 and st2.
This space is used to store the elements pushed into the stacks.
Additionally, the space usage does not scale with the input size, and the implementation uses only a constant amount of extra space.
Therefore, the overall space complexity is O(n).
  
In summary:
Time Complexity: O(n)
Space Complexity: O(n)
*/
