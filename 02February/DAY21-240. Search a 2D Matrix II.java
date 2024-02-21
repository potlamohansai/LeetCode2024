class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int i=0;
        int j=m-1;
        while(j>=0 && i<n){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}


/*
Time Complexity:

Let's denote the number of rows in the matrix as n and the number of columns as m.
The algorithm starts at the top-right corner of the matrix (i=0, j=m-1) and performs a binary search.
In each iteration of the while loop, either i or j is decremented by 1, reducing the search space.
In the worst case, the algorithm traverses the entire diagonal of the matrix once, reaching the bottom-left corner.
The time complexity of the algorithm is therefore O(n + m), where n is the number of rows and m is the number of columns.

Space Complexity:

The algorithm uses only a constant amount of extra space regardless of the input size.
It does not use any additional data structures or recursion.
Thus, the space complexity is O(1).
In summary:

Time Complexity: O(n + m)
Space Complexity: O(1)
*/
