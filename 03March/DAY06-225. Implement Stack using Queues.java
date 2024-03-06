class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/*
Time Complexity:
The push operation involves adding an element to the stack. In this implementation, it requires moving all elements from one queue to another and then adding the new element to the empty queue. This process takes O(n) time, where n is the number of elements in the stack (size of q1 or q2).
The pop, top, and empty operations are straightforward and take O(1) time, as they involve basic queue operations.
Therefore, the time complexity of push is O(n), and the time complexity of pop, top, and empty is O(1).

Space Complexity:
The space complexity is O(n), where n is the number of elements in the stack (size of q1 or q2).
Each element added to the stack occupies space in one of the queues.
Additionally, the queues q1 and q2 themselves occupy space proportional to the number of elements stored in them.
Therefore, the overall space complexity is O(n).

In summary:
Time Complexity:
Push: O(n)
Pop, Top, Empty: O(1)
Space Complexity: O(n)
*/
