class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx ==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1; i>idx; i--){
            if(nums[i] > nums[idx]){
                int temp =nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        int startIdx = idx+1;
        int endIdx = n-1;
        while(startIdx < endIdx){
            int temp = nums[startIdx];
            nums[startIdx] = nums[endIdx];
            nums[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm consists of several steps, including finding the index idx where the next permutation starts, swapping elements to get the next permutation, and reversing the remaining elements. Each of these steps involves iterating through the array or performing constant-time operations. Since the number of steps is not dependent on the array size, the overall time complexity is linear with respect to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, idx, i, temp, startIdx, and endIdx, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
