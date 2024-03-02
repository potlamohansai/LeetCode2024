class Solution {
    public int countPrimes(int n) {
        int[] primes = new int[n+1];
        for(int i =2; i<n; i++) primes[i] = 1;

        for(int i =2; i*i<=n; i++){
            if(primes[i] == 1){
                for(int j=i*i; j<=n; j+=i){
                    primes[j] = 0;
                }
            }
        }
        int count = 0;
        for(int i=0; i<=n; i++){
            if(primes[i] == 1) count++;
        }
        return count;

    }
}



/*
Let's break down the time and space complexity of the provided code:

Time Complexity:

Initialization Loop:

The initialization loop iterates from 2 to n, performing constant time operations. So, it contributes O(n) to the overall time complexity.
Main Loop:

The main loop iterates from 2 to the square root of n. For each iteration, it performs the inner loop, which marks multiples of primes.
The number of iterations of the main loop is approximately sqrt(n). For each iteration, the inner loop runs approximately n/i times (where i is the current prime).
Thus, the total number of operations performed by the inner loops is approximately n/2 + n/3 + n/5 + ... up to primes less than or equal to sqrt(n).
This sum converges to O(n * log(log(n))), as mentioned before, due to the nature of the Sieve of Eratosthenes algorithm.
Counting Loop:

The final loop counts the number of primes found, iterating over the array of primes up to n. It contributes O(n) to the time complexity.
Combining these complexities, the overall time complexity of the code is O(n * log(log(n))).

Space Complexity:
The code uses an array of size n+1 to mark numbers as prime or not prime. Hence, the space complexity is O(n) because the space required scales linearly with the input size.

In summary:
Time Complexity: O(n * log(log(n)))
Space Complexity: O(n)
This complexity analysis considers the nested loops in the provided code and the nature of the Sieve of Eratosthenes algorithm.
*/
