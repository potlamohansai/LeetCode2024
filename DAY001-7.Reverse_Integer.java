class Solution {
    public int reverse(int x) {
        long ans = 0;
        while(x!=0){
            ans = (ans*10)+(x%10);
            x /= 10;
        }
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) return 0;
        return (int)ans;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(log10(x)), where x is the input integer. The while loop runs until the input integer becomes 0, and in each iteration, it divides x by 10. The number of iterations is proportional to the number of digits in the input integer, which is log10(x).

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are ans (a long) and x, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:
Time Complexity: O(log10(x))
Space Complexity: O(1)
*/
