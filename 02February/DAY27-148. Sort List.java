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
    private ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;
        ListNode head = null;
        if(A.val < B.val){
            head = A;
            A = A.next;
        }else{
            head = B;
            B = B.next;
        }

        ListNode current = head;
        while(A != null && B != null){
            if(A.val <= B.val){
                current.next = A;
                A = A.next;
            }else{
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }

        if(A == null) current.next = B;
        if(B == null) current.next = A;

        return head;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode head1 = head;
        ListNode head2 = mid.next;
        mid.next = null;
        head1 = sortList(head1);
        head2 = sortList(head2);
        return merge(head1,head2);
    }
}

/*
Time Complexity:

The sortList function implements the merge sort algorithm for sorting the linked list. The key operations are finding the middle of the list (getMiddle), splitting the list into two halves, recursively sorting each half, and merging the sorted halves (merge).
The getMiddle function runs in O(n) time, where n is the number of nodes in the linked list, as it iterates through the list once.
The splitting operation in the sortList function takes O(log n) time, as it recursively divides the list into halves.
The merging operation in the merge function takes O(n) time, as it iterates through both halves once to merge them.
Since the merging operation is dominant, the overall time complexity of the algorithm is O(n log n), where n is the number of nodes in the linked list.

Space Complexity:

The space complexity is primarily due to the recursive calls in the merge sort algorithm. Each recursive call consumes memory on the call stack. The depth of the recursion tree is O(log n), where n is the number of nodes in the linked list.
Additionally, the merge function uses a constant amount of extra space for its variables.
Therefore, the overall space complexity is O(log n).

In summary:

Time Complexity: O(n log n)
Space Complexity: O(log n)
*/
