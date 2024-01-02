class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n = x;
        int ans = 0;
        
        while(n>0){
            ans = (ans*10) + (n%10);
            n /= 10;
        }

        if(ans == x) return true;
        return false;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(log10(x)). The while loop runs until the variable n becomes 0, and in each iteration, it divides n by 10. The number of iterations is proportional to the number of digits in the input integer x, which is log10(x).

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n and ans, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(log10(x))
Space Complexity: O(1)
*/
