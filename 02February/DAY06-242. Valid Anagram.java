class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;
        int[] freq = new int[26];

        for(int i=0; i<n1; i++){
            freq[s.charAt(i)- 'a']++;
            freq[t.charAt(i)- 'a']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}


/*
Time Complexity:
Let's denote n as the length of the strings s and t.

Initializing the frequency array takes constant time, which is O(1).
The loop to populate the frequency array runs for n iterations, where n is the length of the strings s and t. Therefore, it has a time complexity of O(n).
The second loop iterates over the frequency array, which has a fixed length of 26 (since we are dealing with lowercase English alphabets). So, it takes constant time, which is O(26) or O(1).
Therefore, the overall time complexity is O(n).

Space Complexity:

The space complexity of the code is O(1) because the space used is independent of the input size. Even though we use an integer array of size 26 to store character frequencies, the size of the array (26) is constant and does not depend on the size of the input strings s and t.
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
