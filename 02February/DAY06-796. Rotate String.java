class Solution {
    public boolean rotateString(String s, String goal) {
        int n1 = s.length();
        int n2 = goal.length();

        if(n1 != n2) return false;

        StringBuilder str = new StringBuilder(goal);
        str.append(str);
        return (str.indexOf(s) != -1);
    }
}


/*
Time Complexity:
Let's denote n as the length of the strings s and goal. Building the doubled string takes linear time, which is O(n). The indexOf method on a StringBuilder takes O(n) time in the worst case. Therefore, the overall time complexity of the code is O(n).

Space Complexity:
The space complexity of the code is O(n) as well. This is because the StringBuilder str stores a doubled string, which requires additional space proportional to the length of the input strings.

In summary:

Time Complexity: O(n)
Space Complexity: O(n)
*/
