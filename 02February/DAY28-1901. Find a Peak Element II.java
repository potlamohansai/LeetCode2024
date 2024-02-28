class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int startCol = 0;
        int endCol = m-1;
        while(startCol <= endCol){
            int maxRow = 0;
            int midCol = startCol+(endCol-startCol)/2;
            for(int row =0; row<mat.length; row++){
                maxRow = (mat[row][midCol]>=mat[maxRow][midCol]) ? row:maxRow;
            }
            boolean leftIsBig = midCol-1 >= startCol && mat[maxRow][midCol-1]>mat[maxRow][midCol];
            boolean rightIsBig = midCol+1 <= endCol && mat[maxRow][midCol+1]>mat[maxRow][midCol];

            if(!leftIsBig && !rightIsBig){
                return new int[]{maxRow,midCol};
            }
            else if(rightIsBig){
                startCol = midCol+1;
            }
            else{
                endCol = midCol-1;
            }
        }
        return null;
    }
}


/*
Time Complexity:

The code uses a binary search approach to find the peak element. It searches for the maximum element in the mid column of the matrix.
The binary search iterates until the start and end columns meet, which takes O(log m), where m is the number of columns in the matrix.
Inside the binary search loop, there's a loop that iterates through all rows of the matrix to find the maximum element in the mid column. This loop runs in O(n) time, where n is the number of rows in the matrix.
Therefore, the overall time complexity of the algorithm is O(n log m), where n is the number of rows and m is the number of columns in the matrix.

Space Complexity:

The space complexity is primarily due to the variables used for indexing and comparison, which require constant space.
Additionally, there's a small amount of space used for the variables inside the loop, which also require constant space.
Therefore, the overall space complexity is O(1).

In summary:

Time Complexity: O(n log m)
Space Complexity: O(1)
*/
