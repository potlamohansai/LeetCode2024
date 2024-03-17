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
    ArrayList<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        traversal(root);
        return ans;
    }
    private void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        traversal(root.right);
        ans.add(root.val);
    }
}


/*
Time Complexity:
In the worst-case scenario, where the binary tree is skewed (i.e., each node only has a left child or only has a right child), the time complexity would be O(n), where 'n' is the number of nodes in the tree.
This is because in such a scenario, we would visit each node exactly once.

Space Complexity:
The space complexity is also O(n), where 'n' is the number of nodes in the tree.
This is because we are using an additional ArrayList (ans) to store the postorder traversal elements.
The size of the ArrayList will be proportional to the number of nodes in the tree.
Additionally, the recursive calls in the traversal function would require space on the call stack, but since the maximum depth of the call stack is bounded by the height of the binary tree, which is O(n) in the worst case for a skewed tree, the space complexity remains O(n).
So, both the time and space complexity of the provided code are O(n), where 'n' is the number of nodes in the binary tree.
*/
