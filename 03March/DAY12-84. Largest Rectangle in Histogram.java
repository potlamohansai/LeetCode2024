class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] minL = minElementsLeft(heights);
        int[] minR = minElementsRight(heights);
        int ans =0;

        for(int i=0; i<n; i++){
            int j = minL[i];
            int k = minR[i];
            if(k == -1) k=n;
            ans = Math.max(ans, heights[i]*(k-j-1));
        }
        return ans;
    }

    private int[] minElementsLeft(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    private int[] minElementsRight(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
}

/*
Time Complexity:
The largestRectangleArea method iterates through the array once and calls the minElementsLeft and minElementsRight methods, each of which also iterates through the array once. Therefore, the time complexity of these methods is O(n + n + n) = O(3n) ≈ O(n).
Within each of the minElementsLeft and minElementsRight methods, there are while loops that potentially iterate over all elements of the input array. In the worst case, each element is pushed and popped from the stack once, resulting in a total of O(n) operations within each method.
Overall, the time complexity of the code is O(n) due to the linear time complexity of iterating through the array and the O(n) operations within each of the minElementsLeft and minElementsRight methods.
  
Space Complexity:
The space complexity of the provided code is also O(n) due to the usage of two integer arrays minL and minR, each of size n, to store the results of the minElementsLeft and minElementsRight methods.
Additionally, stacks are used in the minElementsLeft and minElementsRight methods to store indices. In the worst case, both stacks could contain all elements of the input array, resulting in an additional space complexity of O(n) for the stacks.
Therefore, the overall space complexity is O(n) due to the arrays and stacks used in the implementation.

In summary:
Time Complexity: O(N)
Space Complexity: O(N)
*/
