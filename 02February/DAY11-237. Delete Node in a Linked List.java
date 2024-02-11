/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
Time Complexity:
The time complexity of this code is O(1). Regardless of the length of the linked list, the code performs a constant number of operations: it updates the value of the current node to the value of its next node, and it updates the pointer of the current node to skip the next node. This operation takes constant time, so the time complexity remains O(1).

Space Complexity:
The space complexity is also O(1). The algorithm does not use any extra space that scales with the size of the input. It only modifies the given linked list in place, and the amount of additional memory used does not depend on the size of the input. Therefore, the space complexity is constant, O(1).

In summary:

Time Complexity: O(1)
Space Complexity: O(1)
*/
