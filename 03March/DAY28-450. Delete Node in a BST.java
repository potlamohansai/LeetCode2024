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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null && root.right == null) return null;
            else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                int maxVal = findMax(root.left);
                root.val = maxVal;
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

    private int findMax(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root.val;
    }
}


/*
The time complexity of the provided code for deleting a node from a binary search tree (BST) depends on the height of the tree (h).
In the worst-case scenario, the height of the tree is O(n), where n is the number of nodes in the tree, which can occur if the tree is completely unbalanced.
In this case, the time complexity of deleting a node would be O(n) because it may require traversing through all the nodes in the tree to find the node to be deleted and adjust the tree structure accordingly.

The space complexity of the provided code is O(h), where h is the height of the tree.
This space complexity arises due to the recursion stack space used during the recursive calls.
In the worst-case scenario, the space complexity can also be O(n), where n is the number of nodes in the tree, if the tree is completely unbalanced.

Overall:
Time Complexity: O(n) in the worst case, O(h) in the average case.
Space Complexity: O(n) in the worst case, O(h) in the average case.
*/
