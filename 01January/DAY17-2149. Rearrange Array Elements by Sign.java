class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posidx =0, negidx=1;

        for(int i=0; i<n; i++){
            if(nums[i]>0){
                ans[posidx] = nums[i];
                posidx +=2;
            }else{
                ans[negidx] = nums[i];
                negidx +=2;
            }
        }
        return ans;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm iterates through the array once, and for each element, it performs constant-time operations. The loop iterates through the entire array, and the number of iterations is proportional to the size of the input array.

Space Complexity:
The space complexity is O(n). An additional array ans of the same size as the input array is used. In the worst case, where all elements are positive or all elements are negative, the size of the ans array is equal to the size of the input array.
Other than the auxiliary array, there are a few constant space variables (n, posidx, negidx, i), which contribute to constant space complexity.

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
