class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;

        int i=0;
        long num =0;
        int sign = 1;

        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i< s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';

            if(num > (Integer.MAX_VALUE -digit)/10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num*10 + digit;
            i++;
        }
        return (int) (sign*num);
    }
}



/*
Time Complexity:
The time complexity of this code is O(n), where n is the length of the input string s.

The code iterates through the characters of the string s once in a linear manner.
Each character is processed once to determine if it is a sign character ('+' or '-') or a digit.
Additionally, the trim function has a linear time complexity as well.
Therefore, the overall time complexity is O(n).

Space Complexity:
The space complexity of this code is O(1), i.e., constant space.

The space used by the additional variables (i, num, sign, digit) and the return value does not depend on the size of the input.
Although the trim function may create a new string, it only trims leading and trailing whitespace, not affecting the overall space complexity significantly.
Hence, the space complexity remains constant, irrespective of the input size.
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
