class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int count =0;
        int j=1, i=1;
        ans[0] =nums[0];

        while(i<n){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                ans[j] = nums[i];
                j++;
            }
            i++;
        }

        for(int k=0; k<n; k++){
            nums[k] = ans[k];
        }
        return n-count;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:

The loop that iterates through the array nums has a time complexity of O(n), where n is the length of the array.
The second loop that copies elements from the auxiliary array ans back to nums also has a time complexity of O(n).
The dominant factor is the linear iteration through the array, so the overall time complexity is O(n).

Space Complexity:

The space complexity is O(n). An additional array ans of the same size as the input array is used. In the worst case, where there are no duplicate elements, the size of the ans array is equal to the size of the input array.
Other than the auxiliary array, there are a few constant space variables (n, count, j, i, ans[0]), which contribute to constant space complexity.
In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
