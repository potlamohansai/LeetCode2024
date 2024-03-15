class Solution {
    public int divide(int A, int B) {
    if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
    int a = Math.abs(A), b = Math.abs(B), res = 0;
    for (int x = 31; x >= 0; x--)
        if ((a >>> x) - b >= 0) {
            res += 1 << x;
            a -= b << x;
        }
    return (A > 0) == (B > 0) ? res : -res;
    }
}


/*
Time Complexity: O(1)
The time complexity is constant because the algorithm iterates through the loop a fixed number of times (32 iterations), regardless of the size of the input. Therefore, it is not dependent on the size of the input, and it can be expressed as O(1).

Space Complexity: O(1)
The space complexity is also constant because the algorithm uses a fixed amount of extra space. It only requires a few integer variables (a, b, res, x) regardless of the size of the input. Hence, the space complexity is O(1).
  */
