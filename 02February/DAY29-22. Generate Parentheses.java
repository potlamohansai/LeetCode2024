class Solution {
    List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        generate(n, 0, 0, "");
        return ans;
    }
    private void generate(int n, int open, int close, String str){
        if(open == n && close == n){
            ans.add(new String(str));
            return;
        }
        if(open < n){
            generate(n,open+1, close, str+"(");
        }
        if(close < open){
            generate(n,open, close+1, str+")");
        }
    }
}


/*
Time Complexity:

The time complexity of generating all valid parenthesis strings using a backtracking algorithm is often expressed as O(2^N), where N is the number of pairs of parentheses to be generated.
This approximation comes from the fact that at each position in the string, there are two choices: either to open a parenthesis or to close a parenthesis.
The number of recursive calls in this case will be 2^N as at each level of recursion, there are two branches.
However, it's important to note that the actual time complexity is bounded by O(4^N/sqrt(N)), as mentioned earlier, due to the properties of the Catalan numbers.

Space Complexity:
The space complexity is often approximated as O(N), where N is the number of pairs of parentheses to be generated.
This approximation comes from the fact that the depth of recursion, and thus the space required on the call stack, is proportional to the number of parentheses pairs.
Additionally, the space complexity of the output list, where each valid string is stored, is O(N) as well.

However, it's important to note that the actual space complexity is also influenced by the recursion tree's width, which can be exponential, contributing to the overall space complexity.
While these approximations provide a simplified understanding of the complexity, it's essential to recognize that the actual complexity might differ and depend on various factors, including the specific implementation details and the properties of the problem being solved.
  */
