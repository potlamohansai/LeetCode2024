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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}

/*
Time Complexity:
The code iterates through both input linked lists simultaneously, processing each node once. This process takes O(max(m, n)) time, where m is the number of nodes in the first linked list (l1) and n is the number of nodes in the second linked list (l2).
Inside the loop, each iteration involves simple arithmetic operations, which are constant time.
Therefore, the overall time complexity is O(max(m, n)).

Space Complexity:
The space complexity is O(max(m, n)), where m is the number of nodes in the first linked list (l1) and n is the number of nodes in the second linked list (l2).
The additional space is used for creating a new linked list to store the sum of the two input linked lists. The size of this new linked list is at most max(m, n) + 1, as there might be a carry in the highest order digit.
The space used by the additional linked list is the dominant factor in determining the space complexity.
Therefore, the overall space complexity is O(max(m, n)).

In summary:
Time Complexity: O(max(m, n))
Space Complexity: O(max(m, n))
*/
