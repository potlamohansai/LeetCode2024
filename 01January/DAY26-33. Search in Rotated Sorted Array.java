class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target ){
                return mid;
            }
            if(nums[l] <= nums[mid]){ // left half is sorted
                if(nums[l] <= target && target < nums[mid]){
                    r = mid-1;    //search in left half
                }else{
                    l = mid+1;
                }
            }else{  //right half is sorted
                if(target <= nums[r] && nums[mid] < target){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        }
        return -1; 
    }
}


/*
Time Complexity:
The time complexity of this code is O(log n), where n is the length of the input array nums. The binary search is used to find the target element. In each iteration, the search space is effectively halved, resulting in a logarithmic number of iterations. Therefore, the time complexity is logarithmic with respect to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, l, r, mid, target, and nums, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(log n)
Space Complexity: O(1)
*/
