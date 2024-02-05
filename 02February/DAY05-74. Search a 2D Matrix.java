class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int l=0, r=n*m-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            int midValue = matrix[mid/m][mid%m];

            if(midValue == target) return true;
            if(midValue < target) l = mid+1;
            else r = mid-1;
        }
        return false;
    }
}


/*
Time Complexity:
The time complexity of the given code is O(log(NM)), where N is the number of rows, and M is the number of columns in the matrix. The binary search is performed on the flattened matrix, and in the worst case, the search space is reduced by half in each iteration.

Space Complexity:
The space complexity is O(1). The algorithm uses only a constant amount of additional space for variables (l, r, mid, and midValue), and it does not depend on the size of the input matrix.

In summary:

Time Complexity: O(log(N*M))
Space Complexity: O(1)
*/
