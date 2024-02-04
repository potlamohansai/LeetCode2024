class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length;

        String first = strs[0];
        String last = strs[n-1];

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}


/*
Time Complexity:
The time complexity of the given code is O(m * n), where m is the length of the longest string in the array and n is the number of strings in the array. The dominant factor is the iteration through the characters of the first and last strings. The loop runs until the end of the common prefix or until the length of the shorter string.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The primary variables used are ans (StringBuilder), strs (input array), first, and last. The space requirements for these variables are constant as they do not depend on the size of the input array.

In summary:

Time Complexity: O(m * n)
Space Complexity: O(1)
*/
