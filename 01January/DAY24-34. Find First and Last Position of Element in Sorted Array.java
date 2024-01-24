class Solution {
    private int findIndex(int[] a, int target, boolean direction){
        int l=0, r=a.length-1;
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid] == target){
                ans = mid;
                if(direction){
                    r =mid-1;
                }else{
                    l =mid+1;
                }
            }else if(a[mid] > target){
                r =mid-1;
            }else{
                l =mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = findIndex(nums,target,true);
        if(left == -1) return new int[] {-1,-1};
        int right = findIndex(nums,target,false);
        return new int[] {left,right};
    }
}


/*
Time Complexity:
The time complexity of this code is O(log n), where n is the length of the input array nums. The binary search algorithm is used twice: once to find the leftmost occurrence of the target (findIndex(nums, target, true)), and once to find the rightmost occurrence of the target (findIndex(nums, target, false)). Each binary search operation takes logarithmic time, and since there are two separate searches, the overall time complexity is still logarithmic.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, left, right, nums, target, l, r, mid, and ans, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(log n)
Space Complexity: O(1)
*/
