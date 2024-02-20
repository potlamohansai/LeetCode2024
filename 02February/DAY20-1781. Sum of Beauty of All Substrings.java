class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum =0;
        for(int i=0; i<n; i++){
            int[] cnt = new int[26];
            for(int j=i; j<n; j++){
                int ind = s.charAt(j) -'a';
                cnt[ind]++;
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                for(int k=0; k<26; k++){
                    maxi= Math.max(cnt[k], maxi);
                    if(cnt[k] !=0 && cnt[k]<mini) mini = cnt[k];
                }
                sum += (maxi-mini);
            }
        }
        return sum;
    }
}


/*
Time Complexity:
Let's analyze the time complexity of the given code:

The outer loop runs from 0 to n-1, where n is the length of the string s.
The inner loop also runs from i to n-1, where i ranges from 0 to n-1.
Within the inner loop, there is another loop that iterates over the entire array cnt, which has a constant size of 26.
Considering all nested loops:

The outer loop runs n times.
The inner loop runs (n - i) times for each iteration of the outer loop.
The innermost loop runs a constant number of iterations (26 iterations).
Hence, the overall time complexity is approximately O(n^2), where n is the length of the string s.

Space Complexity:
The space complexity of the code is O(1).

It uses a constant amount of extra space regardless of the input size.
The array cnt has a fixed size of 26, which doesn't depend on the input size.
The integer variables (sum, n, ind, maxi, mini) occupy constant space.
In summary:

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
