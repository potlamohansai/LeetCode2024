class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        String[] words = s.trim().split("\s+");
        System.out.println(Arrays.asList(words));

        for(int i=words.length-1; i>=0; i--){
            if(i !=0){
                ans.append(words[i]+ " ");
            }else{
                ans.append(words[i]);
            }
        }
        return ans.toString();
    }
}


/*
Time Complexity:
The time complexity of the given code is O(n), where n is the length of the input string s. The algorithm performs the following steps:

Trims the input string.
Splits the trimmed string into an array of words using split.
Iterates through the array of words in reverse order and appends them to the StringBuilder.
All these operations involve linear time complexity with respect to the size of the input string.

Space Complexity:
The space complexity is also O(n). The space required for the StringBuilder ans is proportional to the length of the input string. Additionally, the words array is created, and its space complexity is also proportional to the length of the input string.

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
