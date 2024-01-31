class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> nCr = new ArrayList<>();

        for(int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for(int j=1; j<i; j++){
                int prev1 = nCr.get(i-1).get(j-1);
                int prev2 = nCr.get(i-1).get(j);
                row.add(prev1 + prev2);
            }
            if(i>0){
                row.add(1);
            }
            nCr.add(row);
        }
        return nCr;
    }
}


/*
Time Complexity:
The time complexity of the given code is O(numRows^2), where numRows is the input parameter. The code generates a Pascal's Triangle with numRows rows, and each row contains a number of elements equal to the row number. In each row, the loop runs up to the row number, and for each element, it performs constant-time operations. Therefore, the overall time complexity is quadratic in terms of the numRows.

Space Complexity:
The space complexity is O(numRows^2) as well. The space required to store the generated Pascal's Triangle is proportional to the total number of elements in the triangle. In the worst case, the number of elements is approximately numRows^2/2, leading to a quadratic space complexity.

In summary:

Time Complexity: O(numRows^2)
Space Complexity: O(numRows^2)
*/
