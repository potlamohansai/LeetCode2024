class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count =0;

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum +=nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
}


/*
Time Complexity:
The time complexity of this code is O(n^2), where n is the length of the input array nums. The algorithm uses two nested loops. The outer loop iterates over each element in the array, and the inner loop calculates the sum of subarrays starting from the current element. In the worst case, the inner loop iterates n/2 times on average for each outer loop iteration, leading to a quadratic time complexity.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, count, i, j, and sum, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
