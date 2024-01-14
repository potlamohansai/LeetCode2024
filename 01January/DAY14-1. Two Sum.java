class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<n; i++){
            int moreNeeded = target - nums[i]; 
            if( hm.containsKey(moreNeeded)){
                ans[0] = i;
                ans[1] = hm.get(moreNeeded);
                break;
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return ans;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n), where n is the length of the array nums. The algorithm iterates through the array once, and for each element, it performs constant-time operations. The operations inside the loop, such as checking for the complement in the HashMap and updating the HashMap, are constant time on average. Therefore, the time complexity is linear with respect to the size of the input array.

Space Complexity:
The space complexity is O(n). In the worst case, the HashMap hm can store all elements from the array nums along with their indices. Therefore, the space complexity is proportional to the size of the input array. Additionally, the space used for the ans array and other constant space variables (n, target, i, moreNeeded) is also constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
