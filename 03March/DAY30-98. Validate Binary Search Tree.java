/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return (check(root.left, min, root.val) && check(root.right, root.val, max));
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of nodes in the binary tree.
This is because the code traverses each node of the tree exactly once in the worst-case scenario.

The space complexity is also O(n).
This is because the code employs a recursive approach to traverse the tree, and the depth of the recursion could potentially be equal to the height of the tree, which can be at most n in the case of a skewed tree.
Therefore, in the worst-case scenario, the space required by the call stack would be O(n).

In summary:
Time Complexity: O(N)
Space Complexity: O(N)
*/
