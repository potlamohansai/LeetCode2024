class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        check(0, nums,temp );
        return ans;
    }

    private void check(int i, int[] arr, ArrayList<Integer> temp){
        if( i == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        check(i+1, arr, temp);
        temp.remove(temp.size()-1);
        check(i+1, arr, temp);
    }
}


/*
The time complexity of the given code is O(2^N), where N is the length of the input array nums.
This is because for each element in the array, there are two choices: either include it in the subset or exclude it.
Since there are 2^N possible subsets (including the empty set and the set with all elements), the time complexity is exponential.

The space complexity is also O(2^N), as there are 2^N possible subsets, and each subset can have at most N elements in it.
Therefore, the space complexity of storing all subsets is exponential. Additionally, there is auxiliary space required for recursive function calls, which is proportional to the depth of the recursion, but it is still within the overall exponential space complexity.
  */
