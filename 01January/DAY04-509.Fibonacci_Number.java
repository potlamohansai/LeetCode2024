class Solution {
    private int fibonacci(int a){
        if(a==0||a==1) return a;
        return fibonacci(a-1)+fibonacci(a-2);
    }
    public int fib(int n) {
        return fibonacci(n);
    }
}

/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of the code is exponential, specifically O(2^n). This is because the fibonacci function recursively calls itself twice for each value of a (fibonacci(a-1) and fibonacci(a-2)), leading to an exponential number of recursive calls.

The recursive nature of the Fibonacci calculation results in repeated computations, making the time complexity exponential. The number of function calls grows rapidly with the input n, and the same values are recomputed multiple times.

Space Complexity:
The space complexity is determined by the maximum depth of the recursion, which is O(n) in this case. Each recursive call adds a new frame to the call stack, and the maximum depth of the stack is proportional to the input n.

In summary:

Time Complexity: O(2^n)
Space Complexity: O(n)
*/
