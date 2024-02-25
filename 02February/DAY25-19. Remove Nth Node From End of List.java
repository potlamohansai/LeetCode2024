/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}


/*
Time Complexity:

The algorithm makes two passes through the linked list:
The first pass is to move the fast pointer to the nth node from the beginning of the list, which takes O(n) time.
The second pass is to move both the fast and slow pointers until the fast pointer reaches the end of the list, which also takes O(n) time.
Therefore, the overall time complexity is O(n), where n is the number of nodes in the linked list.
  
Space Complexity:

The space complexity is O(1) because the algorithm uses a constant amount of extra space regardless of the size of the input linked list.
It only uses a few pointers (fast and slow) to traverse the list and doesn't require additional data structures that grow with the input size.
Thus, the space complexity is constant O(1).
  
In summary:
Time Complexity: O(n)
Space Complexity: O(1)
*/
