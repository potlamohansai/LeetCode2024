class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1 =1;
                ele1 = nums[i];
            }else if(cnt2 == 0 && ele1 != nums[i]){
                cnt2 =1;
                ele2 = nums[i];
            }else if( nums[i] == ele1 ){
                cnt1++;
            }else if( nums[i] == ele2 ){
                cnt2++;
            }else{
                cnt1--; cnt2--;
            }
        }

        cnt1=0; cnt2=0;
        for(int i=0; i<n; i++){
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }

        int mini = n/3+1;
        if(cnt1 >= mini) ans.add(ele1);
        if(cnt2 >= mini) ans.add(ele2);

        return ans;
    }
}


/*
Time Complexity:
The time complexity of the given code is O(n), where n is the length of the input array nums. The algorithm uses two passes through the array. The first pass is to find potential majority elements (ele1 and ele2), and the second pass is to count the occurrences of these potential majority elements and determine if they appear more than n/3 times. Both passes involve iterating through the array, resulting in linear time complexity.

Space Complexity:
The space complexity is O(1). The algorithm uses a constant amount of extra space regardless of the input size. The only variables used are n, cnt1, cnt2, ele1, ele2, and ans, and their space requirements do not depend on the input size. Therefore, the space complexity is constant.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
