class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans  = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();

        for(int k=0; k<2; k++){
            for(int i=n-1; i>=0; i--){
                while(!st.isEmpty() && st.peek() <= nums[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i] = st.peek();
                }
                st.push(nums[i]);
            }
        }
        return ans;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The code contains two nested loops.
The outer loop iterates twice through the array, which is a constant factor.
The inner loop iterates over each element of the array, performing stack operations.
Since each element of the array is processed exactly twice (due to the outer loop), the overall time complexity is O(2n), which simplifies to O(n), where n is the number of elements in the input array.

Space Complexity:
The space complexity primarily depends on the stack usage.
The stack can potentially hold all elements of the input array if they are strictly decreasing.
Therefore, the worst-case space complexity for the stack would be O(n).
Additionally, the space complexity for the output array is O(n) since it stores the next greater elements for each element in the input array.
Hence, the overall space complexity is O(n).

Therefore, the time complexity of the code is O(n), and the space complexity is also O(n).
*/
