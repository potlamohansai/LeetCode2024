class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[] res = new int[3];
        int[] len = new int[3];

        for(int i=0; i<n; i++){
            len = lengthOfPalindrome(s, i, i);
            if(len[2] > res[2]){
                res = len;
            }
            
        }
        for(int i=0; i<n-1; i++){
            len = lengthOfPalindrome(s, i, i+1);
            if(len[2] > res[2]){
                res = len;
            }
        }
        return s.substring(res[0],res[1]+1);
    }

    private int[] lengthOfPalindrome(String s, int left,int right){
        int n = s.length();
        while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }
        return new int[]{left+1,right-1, right-left-1};
        
    }
}


/*
Time Complexity:
The time complexity of this code is O(n^2), where n is the length of the input string s.

The code iterates through the characters of the string s twice.
For each character position i, it calls the lengthOfPalindrome function twice:
Once for the case when the palindrome is centered at i (odd length palindrome).
Once for the case when the palindrome is centered between i and i+1 (even length palindrome).
Therefore, the overall time complexity is dominated by the nested loops and is O(n^2).

Space Complexity:
The space complexity of this code is O(1), i.e., constant space.

The space used by the additional variables (res, len) and the return value does not depend on the size of the input.
Hence, the space complexity remains constant, irrespective of the input size.
In summary:

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
