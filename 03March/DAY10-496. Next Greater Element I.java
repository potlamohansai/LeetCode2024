class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        HashMap<Integer, Integer> ans = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){
            int val = nums2[i];
            while(!st.isEmpty() && nums2[st.peek()]<val){
                st.pop();
            }
            if(st.isEmpty()) ans.put(val, -1);
            else ans.put(val,nums2[st.peek()]);
            st.push(i);
        }
        int m =nums1.length;
        int[] res = new int[m];
        for(int j=0; j<m; j++){
            res[j] = ans.get(nums1[j]);
        }
        return res;
    }
}


/*
Time Complexity:
The code iterates through the nums2 array once with a loop, which takes O(n), where n is the length of nums2.
Inside the loop, there is a while loop that may iterate through the elements of the stack. However, each element is pushed and popped at most once, so the total number of operations across all iterations of the while loop is bounded by O(n).
Therefore, the time complexity of this part is O(n).
After processing nums2, the code iterates through nums1 to populate the result array. This operation takes O(m), where m is the length of nums1.
Overall, the time complexity is O(n + m).
  
Space Complexity:
The space complexity is O(n + m), where n is the length of nums2 and m is the length of nums1.
This space is primarily used for the HashMap ans, which may contain up to n entries.
Additionally, the space complexity includes the stack st, which may store at most n elements.
Finally, the space usage also includes the result array res, which has a length of m.
Therefore, the overall space complexity is O(n + m).
  
In summary:
Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/
