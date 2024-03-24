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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p != null && q == null) return false;
        if(p == null && q != null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


/*
The time complexity of the isSameTree method depends on the number of nodes in the binary trees represented by p and q.
Let's denote n as the number of nodes in the larger tree (either p or q) because in the worst-case scenario, both trees have n nodes.

For each node, the algorithm performs a constant number of operations (comparisons and recursive calls).
Hence, the time complexity of the algorithm is O(n).

The space complexity of the algorithm is also O(n) in the worst case.
This is because the recursion stack can grow as deep as the height of the binary tree, and in the worst case, the height of the binary tree can be equal to the number of nodes, resulting in O(n) space complexity.

So, in summary:
Time complexity: O(n)
Space complexity: O(n)
*/
