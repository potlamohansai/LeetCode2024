class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int i=0, j = n-1;
        int lmax= height[0], rmax = height[n-1];

        while(i<j){
            int water = 0;
            if(lmax<rmax){
                i++;
                water = lmax-height[i];
                lmax = Math.max(lmax, height[i]);
            }
            else{
                j--;
                water = rmax-height[j];
                rmax = Math.max(rmax, height[j]);
            }

            if(water > 0){
                ans += water;
            }
        }
        return ans;
    }
}


/*
Time Complexity:
The code uses a two-pointer approach to traverse the array once from both ends, performing constant-time operations at each step.
The two pointers i and j traverse the array linearly, taking O(n) time, where n is the length of the height array.
Inside the loop, the code performs constant-time operations like comparisons and updates.
Therefore, the overall time complexity of the algorithm is O(n).
  
Space Complexity:
The space complexity is O(1) because the code uses only a constant amount of extra space regardless of the size of the input array.
The space usage does not scale with the input size.
Therefore, the overall space complexity is O(1).
  
In summary:
Time Complexity: O(n)
Space Complexity: O(1)
*/
