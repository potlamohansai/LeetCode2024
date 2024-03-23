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
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        check(root);
        return maxSum;
    }

    private int check(TreeNode root){
        if(root == null) return 0;
        int l = Math.max(0, check(root.left));
        int r = Math.max(0, check(root.right));
        maxSum = Math.max(maxSum, root.val+l+r);
        return root.val+Math.max(l,r);
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of nodes in the binary tree.
This is because the code traverses each node exactly once in a depth-first manner.

The space complexity of the code is O(h), where h is the height of the binary tree.
This is because the space used by the recursive calls on the call stack depends on the height of the tree due to the depth-first traversal.
In the worst case, if the tree is skewed, the height of the tree could be equal to the number of nodes, resulting in O(n) space complexity.
However, in a balanced binary tree, the space complexity would be O(log n), where n is the number of nodes.
*/





