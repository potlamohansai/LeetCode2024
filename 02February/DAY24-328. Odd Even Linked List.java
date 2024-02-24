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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode last = head.next;

        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = last;
        return head;
    }
}


/*
Time Complexity:

The code iterates through the linked list once, and at each iteration, it updates pointers without nested loops.
Therefore, the time complexity of this code is O(n), where n is the number of nodes in the linked list.

Space Complexity:

The space complexity is O(1) because the algorithm only uses a constant amount of extra space regardless of the size of the input linked list.
It doesn't use any additional data structures or recursion that would grow with the input size.
Thus, the space complexity is constant O(1).
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
