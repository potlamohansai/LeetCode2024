class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if( (ch>='a' && ch<='z') || (ch >='0'&& ch<='9')){
                str.append(ch);
            }
        }
        //System.out.println(str);
        int l=0, r= str.length()-1;
        while(l<r){
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:

The loop that iterates through the characters of the input string has a time complexity of O(n), where n is the length of the input string s.
The loop to check if the string is a palindrome also has a time complexity of O(n), where n is the length of the modified string str (after removing non-alphanumeric characters).
The dominant factor is the linear iteration through the characters of the input string and the modified string, so the overall time complexity is O(n).

Space Complexity:

The space complexity is influenced by the additional space used for the StringBuilder (str).
The space required for str depends on the number of alphanumeric characters in the input string. In the worst case, where all characters are alphanumeric, the space complexity is O(n).
The additional space complexity is due to the l and r variables, which require constant space.
In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
