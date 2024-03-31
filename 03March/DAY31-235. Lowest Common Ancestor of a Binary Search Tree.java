/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
        while(cur != null){
            if(p.val < cur.val && q.val < cur.val){
                cur = cur.left;
            }else if(p.val > cur.val && q.val > cur.val){
                cur = cur.right;
            }else{
                return cur;
            }
        }
        return null;
    }
}

/*
The time complexity of the provided code is O(h), where h is the height of the binary search tree (BST).
This is because the algorithm traverses the tree from the root to the LCA node, and in the worst-case scenario, the traversal path follows the height of the tree.

The space complexity of the code is O(1), as it uses only a constant amount of extra space regardless of the input size.
This is because the algorithm operates iteratively and doesn't use any data structures whose space requirements depend on the input size.

In summary:
Time Complexity: O(H)
Space Complexity: O(1)
*/
  
