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
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while( cur != null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }
}


/*
Time Complexity:
Let's analyze the time complexity of the reverseList method:

The algorithm iterates through the entire linked list once.
At each iteration, it performs constant time operations to rearrange the nodes.
Therefore, the time complexity is O(n), where n is the number of nodes in the linked list.
Space Complexity:
The space complexity of this algorithm is O(1) because it uses only a constant amount of extra space regardless of the size of the input linked list. The algorithm performs all operations in-place without using any additional data structures that grow with the input size.

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
