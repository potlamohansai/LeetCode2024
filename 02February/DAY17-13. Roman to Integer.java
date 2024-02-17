class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans =0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            char nxt = (i != n-1) ? s.charAt(i+1): '0';
            if(valueOf(c) < valueOf(nxt)){
                ans -= valueOf(c);
            }else{
                ans += valueOf(c);
            }
        }
        return ans;
    }

    private int valueOf(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


/*
Time Complexity:
The time complexity of this algorithm is O(n), where n is the length of the input string s.

The algorithm iterates through each character of the string once.
For each character, it determines its corresponding integer value using a constant-time lookup function.
The lookup function involves a switch-case statement with constant time complexity.
Therefore, the time complexity is linear with respect to the size of the input string.

Space Complexity:
The space complexity of this algorithm is O(1), constant space complexity.

The algorithm only uses a constant amount of extra space regardless of the size of the input string.
It does not use any data structures whose space requirements depend on the input size.
The only additional space used is for a few integer variables (n, ans) and the character variables (c, nxt) which require constant space.
Therefore, the space complexity is independent of the input size and can be considered constant.
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
