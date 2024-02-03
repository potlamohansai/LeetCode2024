class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            if(i >0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j> i+1 && nums[j] == nums[j-1]) continue;
                int k =j+1;
                int l =n-1;

                while(k<l){
                    long sum = nums[i];
                    sum +=nums[j];
                    sum +=nums[k];
                    sum +=nums[l];

                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }else if(sum <target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}


/*
Time Complexity:
The time complexity of the given code is O(n^3), where n is the length of the input array nums. The dominant factor is the nested loop structure. The outer loop runs in O(n) time, and for each iteration of the outer loop, there is a nested loop (two inner loops). The overall time complexity is cubic.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The primary variables used are ans (List of Lists), nums (input array), and a few integer variables (i, j, k, l, sum, temp). The space requirements for these variables are constant as they do not depend on the size of the input array.

In summary:

Time Complexity: O(n^3)
Space Complexity: O(1)
*/
