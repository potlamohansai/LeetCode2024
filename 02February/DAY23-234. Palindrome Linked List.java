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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode start = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode cur = start;
        while(cur != null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        ListNode head2 = prev;
        ListNode head1 = head;

        while(head2 != null){
            if(head1.val != head2.val) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;

    }
}

/*
Time Complexity:

The code first finds the middle of the linked list by iterating through it once, which takes O(n) time.
Then, it reverses the second half of the linked list, which also takes O(n) time since it iterates through half of the list.
Finally, it compares the elements of the first and second halves of the list, which again takes O(n) time as it iterates through the entire list.
Combining these operations, the overall time complexity is O(n).

Space Complexity:

The space complexity is O(1) because the code only uses a constant amount of extra space for storing variables, regardless of the input size.
The space used is independent of the size of the linked list.
In summary:

Time Complexity: O(n)
Space Complexity: O(1)
*/
