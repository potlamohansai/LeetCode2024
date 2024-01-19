class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean fr = false, fc = false;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    if(i==0) fr = true;
                    if(j==0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i =1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] =0;
                }
            }
        }

        if(fr){
            for(int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }
        if(fc){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}


/*
Let's analyze the time and space complexity of the provided code:

Time Complexity:
The time complexity of this code is O(n * m), where n is the number of rows and m is the number of columns in the matrix. The algorithm iterates through each element in the matrix twice: once to mark the rows and columns that need to be zeroed, and once to actually set those rows and columns to zero. The nested loops iterate through all elements in the matrix, and the additional loops for setting zeros along rows and columns take a constant amount of time.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, m, fr, fc, i, j, and the matrix itself. The space requirements for these variables do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(m * n)
Space Complexity: O(1)
*/
