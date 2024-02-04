class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0] - b[0]; 
            }
        });
        if(n==0) return ans.toArray(new int[0][]);
        int[] temp = intervals[0];
        for(int i=0; i<n; i++){

            if(intervals[i][0] <= temp[1]){
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }else{
                ans.add(temp);
                temp = intervals[i];
            }
        }
        ans.add(temp);
        return ans.toArray(new int[0][]);
    }
}


/*
Time Complexity:
The time complexity of the given code is O(N log N), where N is the number of intervals. The dominant factor is the sorting of the intervals using Arrays.sort(). Sorting the intervals takes O(N log N) time.

The subsequent linear iteration through the sorted intervals takes O(N) time, and each interval is processed once.

Overall, the sorting dominates the time complexity.

Space Complexity:
The space complexity is O(N), where N is the number of intervals. The algorithm uses extra space for the ans ArrayList, which may store all the intervals in the worst case. Additionally, the space required for the temp array is constant.

In summary:

Time Complexity: O(N log N)
Space Complexity: O(N)
*/
