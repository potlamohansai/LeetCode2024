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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur = new TreeNode(val);
        if(root == null) return cur;

        if(val <= root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}


/*
The time complexity of the provided code for inserting a node into a binary search tree (BST) is O(h), where h is the height of the tree.
In the worst-case scenario, where the tree is completely unbalanced (skewed), the height of the tree becomes equal to the number of nodes in the tree, resulting in O(n) time complexity, where n is the number of nodes in the tree.

The space complexity of the provided code is O(h), where h is the height of the tree.
This space complexity arises due to the recursion stack space used during the recursive calls.
In the worst-case scenario, the space complexity can also be O(n), where n is the number of nodes in the tree, if the tree is completely unbalanced.

Overall:
Time Complexity: O(n) in the worst case, O(h) in the average case.
Space Complexity: O(n) in the worst case, O(h) in the average case.
*/
