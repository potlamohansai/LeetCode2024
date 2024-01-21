class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int top =0, bottom = n-1;
        int left =0, right = m-1;

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}


/*
Time Complexity:
The time complexity of this code is O(m * n), where m is the number of columns and n is the number of rows in the matrix. The algorithm iterates through each element in the matrix exactly once, and the number of iterations is proportional to the size of the input matrix. Therefore, the time complexity is linear with respect to the total number of elements in the matrix.

Space Complexity:
The space complexity is O(m * n) as well. The ans list stores all the elements in the matrix, and in the worst case, it may need to store all m * n elements. Each element in the matrix is added to the list, and the size of the list is proportional to the total number of elements in the matrix.

In summary:

Time Complexity: O(m * n)
Space Complexity: O(m * n)
*/
