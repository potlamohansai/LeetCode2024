/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode y = null;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                y = slow;
                break;
            };
        }
        if( y == null) return null;

        ListNode x = head;
        while( x != y){
            x = x.next;
            y = y.next;
        }
        return x;
    }
}

/*
Time Complexity:
The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list.

The algorithm uses Floyd's Tortoise and Hare algorithm to detect a cycle in the linked list. In the worst case, where there is no cycle, the algorithm traverses the entire linked list once, requiring O(n) operations.
If there is a cycle, the algorithm still traverses the linked list linearly, and the fast pointer eventually catches up with the slow pointer within a single traversal.
Space Complexity:
The space complexity of this algorithm is O(1) because it uses only a constant amount of extra space regardless of the size of the input linked list. The algorithm doesn't use any additional data structures that grow with the input size.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
