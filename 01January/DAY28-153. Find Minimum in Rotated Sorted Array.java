class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0, r=n-1;
        int ans = Integer.MAX_VALUE;

        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(nums[l] <= nums[r]){
                ans = Math.min(nums[l], ans);
                break;
            }if(nums[l] <= nums[mid]){
                ans = Math.min(nums[l], ans);
                l = mid+1;
            }else{
                ans = Math.min(nums[mid],ans);
                r = mid-1;
            }
        }
        return ans;
    }
}


/*
Time Complexity:
The time complexity of this code is O(log n), where n is the length of the input array nums. The binary search is used to find the minimum element in the rotated sorted array. In each iteration, the search space is effectively halved, resulting in a logarithmic number of iterations. Therefore, the time complexity is logarithmic with respect to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, l, r, mid, ans, and nums, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(log n)
Space Complexity: O(1)
*/
