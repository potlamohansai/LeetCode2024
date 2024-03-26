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
    public TreeNode searchBST(TreeNode root, int val) {
        while( root != null && root.val != val){
            root = val > root.val ? root.right : root.left; 
        }
        return root;
    }
}


/*
Time Complexity:
In the worst-case scenario, the time complexity is O(h), where h is the height of the binary search tree (BST).
This is because the while loop traverses the tree either to the left or right at each step until it finds the target value or reaches a leaf node.
In a balanced BST, the height h is approximately log(n), where n is the number of nodes in the tree.
However, in the worst case, if the tree is skewed (i.e., all nodes have only one child), the height h can be n, making the time complexity O(n).
  
Space Complexity:
The space complexity is O(1) because the algorithm uses only a constant amount of extra space for variables regardless of the input size.
There is no additional data structure used that grows with the input size.
Thus, the space complexity is constant, O(1).
*/
