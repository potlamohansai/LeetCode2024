class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prod1 = nums[0];
        int prod2 = nums[0];
        int result = nums[0];

        for(int i=1; i<n; i++){
            int ele = nums[i];
            int temp = Math.max(ele, Math.max(prod1*ele, prod2*ele));
            prod2 = Math.min(ele, Math.min(prod1*ele, prod2*ele));
            prod1 = temp;

            result = Math.max(result, prod1);
        }
        return result;
    }
}


/*
Time Complexity:

The given code iterates through the array once, hence the time complexity is O(n), where n is the number of elements in the nums array.
Space Complexity:

The space complexity of the code is O(1) because it uses only a constant amount of extra space regardless of the size of the input array. The variables prod1, prod2, result, ele, and temp are all individual integer variables, and their memory consumption is constant. Therefore, the space complexity is O(1).
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
