class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int ans = 0;
        int count = 0;

        for(int i =0; i<n; i++){
            char c = s.charAt(i);
            if( c == '('){
                count += 1;
            }else if(c == ')'){
                ans = Math.max(ans, count);
                count -= 1;
            }
        }
        return ans;
    }
}


/*
Time Complexity:
The time complexity of this algorithm is O(n), where n is the length of the input string s.

The algorithm iterates through each character of the string once, performing constant-time operations on each character.
Therefore, the time complexity is linear with respect to the length of the input string.
Space Complexity:
The space complexity of this algorithm is O(1), constant space complexity.

The algorithm uses only a few integer variables (n, ans, count) to keep track of the current depth and the maximum depth encountered.
Regardless of the size of the input string, the space used by these variables remains constant.
Therefore, the space complexity is independent of the input size and can be considered constant.
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
