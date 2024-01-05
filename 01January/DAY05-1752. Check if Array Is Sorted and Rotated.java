class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]) count++;
            if(nums[i] > nums[i+1] && nums[0] < nums[n-1]) return false;
            if(count > 1) return false;
        }
        return true;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the input array nums. The loop iterates through the array once, performing constant-time operations for each element. Therefore, the time complexity is linear with respect to the size of the input.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, count, and the loop iterator i, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
