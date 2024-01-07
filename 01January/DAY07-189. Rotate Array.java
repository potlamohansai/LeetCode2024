class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        k = k%n;
        for(int i=0; i<n; i++){
            ans[(i+k)%n] = nums[i];
        }
        for(int j=0; j<n; j++){
            nums[j] = ans[j];
        }
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:

The first loop that iterates through the array nums has a time complexity of O(n), where n is the length of the array.
The second loop that copies elements from the auxiliary array ans back to nums also has a time complexity of O(n).
The dominant factor is the linear iteration through the array, so the overall time complexity is O(n).

Space Complexity:

The space complexity is O(n). An additional array ans of the same size as the input array is used. In the worst case, where there is no rotation (k is a multiple of n), the size of the ans array is equal to the size of the input array.
Other than the auxiliary array, there are a few constant space variables (n, k, i, ans[]), which contribute to constant space complexity.
In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
