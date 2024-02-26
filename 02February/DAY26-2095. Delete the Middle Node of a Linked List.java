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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        ListNode slow = head;
        
        ListNode fast = head.next;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}


/*
Time Complexity:

The algorithm iterates through the linked list with two pointers, slow and fast.
The fast pointer moves twice as fast as the slow pointer, so it covers the list in approximately half the time.
The time complexity of traversing the list with two pointers is O(n/2), which simplifies to O(n), where n is the number of nodes in the linked list.
Therefore, the overall time complexity is O(n).

Space Complexity:

The space complexity is O(1) because the algorithm uses a constant amount of extra space regardless of the size of the input linked list.
It only uses a few pointers (slow and fast) to traverse the list and doesn't require additional data structures that grow with the input size.
Thus, the space complexity is constant O(1).

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
