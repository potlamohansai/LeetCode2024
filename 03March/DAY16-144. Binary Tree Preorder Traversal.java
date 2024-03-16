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
    List<Integer> ans;
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        traverse(root);
        return ans;
    }
    private void traverse(TreeNode root){
        if(root == null) return;
        ans.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of nodes in the binary tree. This is because the function traverse is called once for each node in the tree, and within each call, a constant amount of work is done (adding the node's value to the list). Hence, the time complexity is linear with respect to the number of nodes in the tree.

The space complexity depends on the depth of the function call stack due to recursion, which can be at most the height of the binary tree. In a balanced binary tree, where the height is logarithmic with respect to the number of nodes (H = log(n)), the space complexity would indeed be O(log n). However, in the worst-case scenario of a completely unbalanced binary tree, the height would be equal to the number of nodes (H = n), leading to a space complexity of O(n).
So, to be precise, the space complexity is O(H), where H represents the height of the binary tree.

In summary:
Time Complexity: O(N)
Space Complexity: O(H)
*/

