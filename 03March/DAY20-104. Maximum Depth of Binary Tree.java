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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int L = maxDepth(root.left);
        int R = maxDepth(root.right);

        return 1+Math.max(L,R);
        
    }
}


/*
Time Complexity:
In the worst-case scenario, the algorithm traverses the entire binary tree.
At each node, the algorithm performs constant time operations (comparing and calculating maximum).
Therefore, the time complexity of the algorithm is O(n), where n is the number of nodes in the binary tree.
  
Space Complexity:
The space complexity is determined by the call stack during the recursive calls.
In the worst-case scenario, the recursion depth could be equal to the height of the binary tree.
For a balanced binary tree, the height is approximately log₂(n), where n is the number of nodes. Hence, the space complexity is O(log n).
However, for an unbalanced binary tree, the recursion depth could be as large as n, resulting in a space complexity of O(n).
Overall, the space complexity can be expressed as O(h), where h is the height of the binary tree.
  
Therefore, the time complexity of the code is O(n), and the space complexity is O(h), where h is the height of the binary tree. If the tree is balanced, the space complexity is O(log n). If the tree is unbalanced, the space complexity can be as high as O(n).
*/
