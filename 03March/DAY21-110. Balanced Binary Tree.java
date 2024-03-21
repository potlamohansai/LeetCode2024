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

    boolean isBal;
    public boolean isBalanced(TreeNode root) {
        isBal = true;
        check(root);
        return isBal;
    }
    private int check(TreeNode root){
        if(root == null) return -1;
        int L = check(root.left);
        int R = check(root.right);
        if(Math.abs(L-R) >1) isBal = false;
        return Math.max(L,R)+1;
    }
}

/*
The time complexity of the given code is O(n), where n is the number of nodes in the binary tree.
This is because the check function traverses each node of the binary tree once, and at each node, it performs constant time operations.

The space complexity of the code is O(h), where h is the height of the binary tree.
This is because the space used by the recursive calls on the call stack is proportional to the height of the tree.
In the worst-case scenario, where the tree is completely unbalanced (skewed), the height of the tree could be O(n), but in a balanced binary tree, the height is O(log n), where n is the number of nodes.
Therefore, the space complexity can be O(n) in the worst case and O(log n) in the average case for a balanced binary tree.
  */
