class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0; i<31; i++){
            int ans = (int) Math.pow(2,i);
            if(ans == n) return true;
        }
        return false;
    }
}

/*
Time Complexity:
The code iterates through a loop with a fixed number of iterations, specifically 31 iterations. This loop runs regardless of the input value.
Within each iteration, the code calculates 2^iusing Math.pow(2, i). Calculating 2^i using Math.pow() typically has a time complexity of O(1).
Therefore, the overall time complexity of the loop is O(1) per iteration, and since the loop has a fixed number of iterations, the overall time complexity is O(1) or constant time.
  
Space Complexity:
The space complexity is O(1) because the code only uses a constant amount of extra space regardless of the input size.
The space usage does not scale with the input value or any other variable factor.
Therefore, the overall space complexity is O(1).
  
In summary:
Time Complexity: O(1)
Space Complexity: O(1)
*/
