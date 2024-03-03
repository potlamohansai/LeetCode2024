class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '(' || c =='{' || c =='['){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                if(c == ')' && st.peek() != '(') return false;
                if(c == '}' && st.peek() != '{') return false;
                if(c == ']' && st.peek() != '[') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}


/*
The time complexity of the given code is O(n), where n is the length of the input string s.
This is because the code iterates through each character of the input string once.

The space complexity of the code is also O(n), where n is the length of the input string s.
This is because in the worst case scenario, the stack st could hold all the characters of the input string s.
*/
