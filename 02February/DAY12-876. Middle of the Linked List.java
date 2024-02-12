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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


/*
Time Complexity:
The time complexity of this code is O(n), where n is the number of nodes in the linked list. The algorithm uses two pointers, one slow pointer and one fast pointer, to traverse the list. In each iteration of the while loop, the slow pointer moves one step forward, and the fast pointer moves two steps forward. Since the fast pointer moves twice as fast as the slow pointer, it takes approximately n/2 iterations for the fast pointer to reach the end of the list. Therefore, the time complexity is linear with respect to the number of nodes in the linked list, O(n).

Space Complexity:
The space complexity is O(1). The algorithm only uses a constant amount of extra space regardless of the size of the input. It maintains two pointers, slow and fast, to traverse the linked list, and no additional data structures are used. Thus, the space complexity is constant, O(1).

In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
