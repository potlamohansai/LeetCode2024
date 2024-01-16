//MOORE'S VOTING ALGORITHM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele =0;
        int count =0;
        for(int i=0; i<n; i++){
            if(count ==0){
                count =1;
                ele = nums[i];
            }else if(nums[i] == ele) count++;
            else count--;
        }

        /* Need to Check, If they didn't mention majority element ALWAYS EXISTS
        int cnt =0;
        for(int i=0; i<n; i++){
            if(ele == nums[i]){
                cnt++;
            }
        }
        if(cnt >(n/2)) return ele;
        return -1;
        */

        return ele;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm iterates through the array once, and for each element, it performs constant-time operations. The loop iterates through the entire array, and the number of iterations is proportional to the size of the input array.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, ele, count, and i, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
