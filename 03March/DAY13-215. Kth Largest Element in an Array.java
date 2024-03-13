class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = nums.length;

        for(int i=0; i<k; i++){
            minHeap.offer(nums[i]);
        }
        for(int i=k; i<n; i++){
            if(nums[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }
}

/*
The time complexity of the provided code is O(n log k), where n is the number of elements in the nums array and k is the value of the parameter k.

Explanation:

The first loop runs k times, where k is the given parameter. Inside the loop, it inserts elements into the minHeap. Each insertion operation takes O(log k) time because the heap needs to maintain its property. So, the first loop has a time complexity of O(k log k).

The second loop runs from index k to n-1 (n being the length of the nums array). Inside this loop, there is a conditional operation followed by potential insertions and removals from the minHeap. The insertion and removal operations on the heap both take O(log k) time. Since this loop runs (n - k) times, the time complexity is O((n - k) * log k).

Combining the time complexities of both loops, we get O(k log k + (n - k) * log k), which simplifies to O(n log k).

Summary:
Time Complexity: O(n log k)
Space Complexity: O(k)
*/
