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
    int height;
    public int diameterOfBinaryTree(TreeNode root) {
        check(root);
        return height;
    }

    private int check(TreeNode root){
        if(root == null) return 0;
        int l = check(root.left);
        int r = check(root.right);
        height = Math.max(height, l+r);
        return Math.max(l,r)+1;
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of nodes in the binary tree.
This is because the function check traverses each node of the tree once, and each node is visited only once.

The space complexity is O(n) as well.
This is because the recursive calls to the check function can potentially reach the maximum depth of the binary tree, which in the worst case scenario is the number of nodes in the tree.
Therefore, the space required on the call stack for these recursive calls is proportional to the height of the tree, which can be O(n) in the worst case for an unbalanced tree.
*/
