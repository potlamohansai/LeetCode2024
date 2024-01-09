class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int[] freq = new int[n+1];

        for(int i=0; i<n; i++){
            freq[nums[i]]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] ==0) return i;
        }
        return 0;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:

The first loop that iterates through the array nums has a time complexity of O(n), where n is the length of the array.
The second loop that iterates through the frequency array freq has a time complexity of O(n+1), which can be simplified to O(n).
The dominant factor is the linear iteration through the array, so the overall time complexity is O(n).

Space Complexity:
The space complexity is O(n+1), which can be simplified to O(n). An additional array freq of size n+1 is used to store the frequencies of elements. In the worst case, where each element of nums is unique, the size of the freq array is equal to the size of the input array.
Other than the frequency array, there are a few constant space variables (n, i), which contribute to constant space complexity.

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
