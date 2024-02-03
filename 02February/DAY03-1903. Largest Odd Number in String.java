class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        if(((int)num.charAt(n-1)-'0')%2 == 1) return num;

        for(int i =n-1; i>0; i--){
            int val = ((int)num.charAt(i-1) -'0');
            if(val %2 ==1){
                return num.substring(0,i);
            }
        }
        return "";
    }
}


/*
Time Complexity:
The time complexity of the given code is O(n), where n is the length of the input string num. The algorithm iterates through the characters of the string once, and each iteration involves constant-time operations. Therefore, the overall time complexity is linear with respect to the size of the input string.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The primary variable used is num (input string), and its space requirement is constant as it does not depend on the size of the input string.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
