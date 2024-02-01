class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int count =0;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if( ch == '(') count++;
            else count--;

            if((count == 1 && ch =='(') || (count == 0 && ch ==')')){
                continue;
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}


/*
Time Complexity:
The time complexity of the given code is O(n), where n is the length of the input string s. The algorithm iterates through each character of the input string once, and the operations performed within the loop are constant time. Therefore, the overall time complexity is linear with respect to the size of the input string.

Space Complexity:
The space complexity is O(n) as well. The StringBuilder ans is used to store the resulting string, and in the worst case, the length of this string is equal to the length of the input string. Therefore, the space complexity is linear with respect to the size of the input string.

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
