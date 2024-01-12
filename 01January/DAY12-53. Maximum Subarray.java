class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum =Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum <0){
                sum =0;
            }
        }
        return maxSum;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm iterates through the array once, and for each element, it performs constant-time operations. Therefore, the time complexity is linear with respect to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, maxSum, sum, and i, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
