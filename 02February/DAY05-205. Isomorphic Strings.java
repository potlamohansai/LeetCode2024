class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sToT = new char[256];
        char[] tToS = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sToT[c1] == 0) {
                sToT[c1] = c2;
            } else if (sToT[c1] != c2) {
                return false;
            }

            if (tToS[c2] == 0) {
                tToS[c2] = c1;
            } else if (tToS[c2] != c1) {
                return false;
            }
        }
        return true;
    }
}


/*
Time Complexity:
The time complexity of the given code is O(N), where N is the length of the input strings s and t. The algorithm iterates through the characters of the strings once, and for each character, it performs constant-time operations (assignments and comparisons).

Space Complexity:
The space complexity is O(1). The algorithm uses two arrays (sToT and tToS), each with a constant size of 256 characters. Therefore, the space required by the algorithm is constant and does not depend on the size of the input strings.

In summary:

Time Complexity: O(N)
Space Complexity: O(1)
*/
