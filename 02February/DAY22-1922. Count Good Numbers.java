class Solution {
    int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = (n+1)/2;

        return (int) (pow(5,even) * pow(4,odd) %MOD);
    }
    public long pow(long x, long n){
        if(n==0) return 1;
        long temp = pow(x,n/2);
        if(n%2 ==0){
            return (temp*temp)%MOD;
        }else{
            return (x*temp*temp)%MOD;
        }
    }
}


/*
Time Complexity:

The time complexity of the pow function can be analyzed using the concept of exponentiation by squaring.
In each recursive call to pow, the value of n is halved.
Therefore, the time complexity of the pow function is O(log n).
The countGoodNumbers function calls pow twice with different arguments, which does not affect the overall time complexity.
Hence, the overall time complexity of the algorithm is O(log n).

Space Complexity:

The space complexity is determined by the space used on the call stack during recursive calls to the pow function.
Since the recursive calls are tail-recursive and there are no additional data structures used, the space complexity is O(1) or O(log n) if considering the stack space used for recursion.
Additionally, the algorithm uses a constant amount of space for storing variables like odd, even, and MOD.
Thus, the overall space complexity is O(1) or O(log n) depending on whether the stack space for recursion is counted.
In summary:

Time Complexity: O(log n)
Space Complexity: O(1) or O(log n)
*/
