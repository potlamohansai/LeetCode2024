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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode last = root;
        boolean reverseOrder = false;

        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                TreeNode cur = q.poll();
                if(!reverseOrder){
                    temp.add(cur.val);
                }else{
                    temp.add(0,cur.val);
                }
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
            ans.add(temp);
            reverseOrder = !reverseOrder;
        }
        return  ans;
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of nodes in the binary tree.
This is because the code traverses each node exactly once, and within each iteration of the while loop, it performs constant time operations.

The space complexity is also O(n), where n is the number of nodes in the binary tree.
This is because the code uses a queue to perform level order traversal, and in the worst case scenario, the queue can hold all the nodes of the last level of the binary tree.
Additionally, the space complexity of the ans list is also proportional to the number of nodes in the tree as it stores the traversal result.
Therefore, the overall space complexity is O(n).
*/
