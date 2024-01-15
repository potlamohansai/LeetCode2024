class Solution {
    private void swap(int[] nums , int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0, mid =0, high =n-1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;mid++;
            }else if(nums[mid] == 2){
                swap(nums, high, mid);
                high--;
            }else{
                mid++;
            }
        }
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm iterates through the array once, and in each iteration, it performs constant-time operations. The while loop terminates when mid exceeds high, and since each iteration either increments mid or decrements high, the number of iterations is proportional to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, low, mid, high, and the helper function parameters (a, b, temp). These variables' space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
