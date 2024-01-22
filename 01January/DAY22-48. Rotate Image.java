class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose of the matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse Each row of the matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}


/*
Time Complexity:
The time complexity of this code is O(n^2), where n is the number of rows (or columns) in the square matrix. The first nested loop traverses the upper triangular matrix (excluding the diagonal) and performs constant-time operations for each element. The second nested loop traverses each row but only up to half of the columns, performing constant-time operations for each element. Therefore, the overall time complexity is quadratic with respect to the size of the input matrix.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, i, j, and temp, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
