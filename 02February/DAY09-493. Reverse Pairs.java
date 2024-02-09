class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2L * arr[right])
                right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    private void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}

/*
Time Complexity:

The time complexity of the merge sort algorithm is O(n log n), where n is the number of elements in the nums array.
Additionally, while merging, for each element in the left subarray, we traverse at most the entire right subarray once. Therefore, the countPairs method has a time complexity of O(n).
So, overall, the time complexity is dominated by the merge sort, resulting in O(n log n).
Space Complexity:

In the merge sort algorithm, an ArrayList temp is created during each merge operation to temporarily store the merged elements. The size of this ArrayList can be at most n, where n is the number of elements in the merged subarray.
Additionally, the recursive calls in the mergeSort method also consume space on the call stack. Since the mergeSort method is called recursively log(n) times (where n is the number of elements in the array), the space complexity due to recursion is O(log n).
Therefore, the overall space complexity is O(n) due to the ArrayList temp, as it dominates the space complexity.
In summary:

Time Complexity: O(n log n)
Space Complexity: O(n)
*/
