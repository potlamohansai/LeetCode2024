class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l=0, r=n-1;

        while(l<=r){
            int mid =l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l =mid+1;
            }else{
                r =mid-1;
            }
        }
        return l;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(log n), where n is the length of the array nums. The algorithm uses binary search, which divides the search space in half with each iteration. The number of iterations is logarithmic with respect to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, l, r, mid, and target, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(log n)
Space Complexity: O(1)
*/
