class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            if( i != 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}


/*
Time Complexity:
The time complexity of the given code is O(n^2), where n is the length of the input array nums. The dominant factor is the nested loop structure. The outer loop runs in O(n) time, and for each iteration of the outer loop, the inner while loop also runs in O(n) time. Therefore, the overall time complexity is quadratic.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The primary variables used are ans (List of Lists), nums (input array), and a few integer variables (i, j, k, sum, temp). The space requirements for these variables are constant as they do not depend on the size of the input array.

In summary:

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
