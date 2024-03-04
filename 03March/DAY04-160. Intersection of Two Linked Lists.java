/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int getDifference(ListNode headA, ListNode headB){
        int len1 = 0, len2 = 0;
        while(headA != null || headB != null){
            if(headA != null){
                len1++; headA = headA.next;
            }
            if(headB != null){
                len2++; headB = headB.next;
            }
        }
        return len1-len2;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = getDifference(headA, headB);
        if(diff < 0){
            while(diff++ != 0) headB = headB.next;
        }else{
            while(diff-- != 0) headA = headA.next;
        }

        while(headA != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}


/*
Time Complexity:

The getDifference function iterates through both linked lists to calculate the difference in their lengths. This takes O(n) time, where n is the total number of nodes in both linked lists.
The getIntersectionNode function first calls getDifference, which takes O(n) time.
Then, it adjusts the pointers of the longer linked list (if there's any difference in length) to align them at the same starting point. This adjustment takes O(n) time in the worst case, as it may need to traverse the longer linked list.
Finally, it iterates through the linked lists once until it finds the intersection or reaches the end. This also takes O(n) time in the worst case.
Therefore, the overall time complexity of the algorithm is O(n).
  
Space Complexity:

The space complexity is O(1) because the algorithm uses only a constant amount of extra space regardless of the size of the input linked lists. It doesn't use any additional data structures that grow with the input size.
  
In summary:
Time Complexity: O(n)
Space Complexity: O(1)
*/
