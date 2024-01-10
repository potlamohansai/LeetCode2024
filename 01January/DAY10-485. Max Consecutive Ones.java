class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count =0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count ++;
            }else{
                maxCount = Math.max(maxCount, count);
                count =0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm iterates through the array once, and for each element, it performs constant-time operations. Therefore, the time complexity is linear with respect to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are maxCount, count, n, and i, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
