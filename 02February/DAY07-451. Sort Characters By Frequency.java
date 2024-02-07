class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

       List<Character> pq = new ArrayList<>(hm.keySet());
       Collections.sort(pq, (a,b) -> hm.get(b) - hm.get(a));

        StringBuilder res = new StringBuilder();
        for(char c : pq){
            res.append(String.valueOf(c).repeat(hm.get(c)));
        }
        return res.toString();
    }
}


/*
Time Complexity:
Let's denote n as the length of the input string s.

Constructing the frequency map hm takes O(n) time, as we iterate through each character of the string.
Creating the list pq from the keys of the map takes O(m) time, where m is the number of unique characters in the input string. In the worst case, m can be up to 26 (for lowercase English alphabets) or 256 (for extended ASCII characters).
Sorting the list pq using Collections.sort() takes O(m * log m) time.
Building the result string by repeating characters according to their frequencies takes O(n) time, as we iterate through the sorted list pq and repeat each character its corresponding frequency number of times.
Therefore, the overall time complexity is dominated by the sorting step, so it is O(m * log m).

Space Complexity:

The space complexity is O(n) for storing the input string s.
The space complexity for the map hm is O(m), where m is the number of unique characters in the input string.
The space complexity for the list pq is also O(m), as it contains all unique characters from the input string.
The space complexity for the StringBuilder res is O(n), as it may store up to n characters in the worst case.
Therefore, the overall space complexity is O(n + m).

In summary:

Time Complexity: O(m * log m)
Space Complexity: O(n + m)
*/
