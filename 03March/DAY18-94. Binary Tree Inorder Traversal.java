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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        while(!st.isEmpty() || cur != null){
            if(cur != null){
                st.push(cur);
                cur = cur.left;
            }else{
                cur = st.pop();
                ans.add(cur.val);
                cur = cur.right;
            }
        }
        return ans;
    }
}


/*
Time Complexity:
In the worst-case scenario, the algorithm has to visit all nodes of the binary tree once. Since each node is visited exactly once, the time complexity is O(n), where n is the number of nodes in the binary tree.

Space Complexity:
The space complexity is determined by the maximum size of the stack during the traversal.
In the worst-case scenario, the stack could contain all the nodes of the longest path from the root to a leaf. For a balanced binary tree, the height of the tree is log(n), where n is the number of nodes. So, the space complexity in this case is O(log n).

In the worst case, if the binary tree is skewed (like a linked list), the stack can contain all n nodes. Hence, in this case, the space complexity would be O(n).
Overall, the space complexity is O(n) in the worst case and O(log n) in the average case for a balanced binary tree.

So, the time complexity of the code is O(n), and the space complexity is O(n) in the worst case and O(log n) in the average case.
*/
