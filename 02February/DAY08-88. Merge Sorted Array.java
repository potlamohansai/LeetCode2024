class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >=0 ){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}


/*
Time Complexity:

The time complexity of this code is O(m + n), where:
m is the length of the nums1 array (excluding the extra space for merging),
n is the length of the nums2 array.
The while loop iterates through both nums1 and nums2, and the number of iterations will be at most m + n.
Space Complexity:

The space complexity is O(1) because the merging is done in-place in the nums1 array without using any extra space that scales with the input size. Only a few extra variables are used, regardless of the size of the input arrays.
In summary:

Time Complexity: O(m + n)
Space Complexity: O(1)
*/
