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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        List<Integer> temp = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode last = root;

        while(!q.isEmpty()){
            TreeNode x = q.poll();
            temp.add(x.val);
            if(x.left != null) q.offer(x.left);
            if(x.right != null) q.offer(x.right);

            if(x == last){
                ans.add(temp);
                temp = new ArrayList<>();
                if(!q.isEmpty()) last = q.peekLast();
            }
        }
        return ans;
    }
}

/*
The time complexity of the provided code is O(N), where N is the number of nodes in the binary tree.
This is because the algorithm traverses each node of the tree once.

The space complexity of the code is also O(N), where N is the maximum number of nodes that can be present at any level in the binary tree.
This is because at any point in time, the algorithm stores nodes of a particular level in the temp list, and the maximum number of nodes that can be present at any level is N/2, where N is the total number of nodes in the binary tree (in the case of a perfect binary tree).
Additionally, the queue q can contain at most all the nodes at the last level, which could also be N/2. Therefore, the space complexity is O(N).

In summary:
Time Complexity:O(N)
Space Complexity:O(N)
*/
