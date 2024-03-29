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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode cur = root;
        int count =0;

        while(cur != null){
            if(cur.left == null){
                count++;
                if(count == k) return cur.val;
                cur = cur.right;
            }else{
                TreeNode pre = cur.left;
                while(pre.right != null && pre.right != cur){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = cur;
                    cur = cur.left;
                }else{
                    pre.right = null;
                    count++;
                    if(count == k) return cur.val;
                    cur = cur.right;
                }
                
            }
        }
        return -1;
    }
}


/*
The time complexity of the provided code for finding the kth smallest element in a binary search tree (BST) is O(n), where n is the number of nodes in the tree.
This is because, in the worst-case scenario, the code traverses each node of the tree once.

The space complexity of the provided code is O(1), indicating constant space complexity.
This is because the space used by the algorithm does not increase with the size of the input (the size of the tree).
The algorithm only utilizes a constant amount of extra space for storing variables like cur, count, and pre, regardless of the size of the tree.

Overall:
Time Complexity: O(n)
Space Complexity: O(1)
*/
