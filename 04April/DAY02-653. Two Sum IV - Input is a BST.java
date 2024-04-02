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
    ArrayList<Integer> arr;
    public boolean findTarget(TreeNode root, int k) {
        arr = new ArrayList<>();
        inorder(root);
        int n = arr.size();

        int i=0, j= n-1;

        while(i<j){
            int sum = arr.get(i) + arr.get(j);
            if(sum == k) return true;

            if(sum < k) i++;
            else j--;
        }
        return false;
        
    }
    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of nodes in the binary tree.
This complexity arises from the inorder traversal of the binary tree, which visits each node once, and the subsequent two-pointer approach that iterates through the sorted array to find if there exists a pair of elements summing up to k.
Both of these operations have linear time complexities.

The space complexity is also O(n).
This is because the code utilizes an ArrayList arr to store the inorder traversal of the binary tree, which can potentially contain all the nodes of the tree.
Additionally, the recursion stack used for the inorder traversal can go as deep as the height of the tree, which is also O(n) in the worst case for an unbalanced tree.
Therefore, the overall space complexity is linear with respect to the number of nodes in the binary tree.

In summary:
Time Complexity: O(N)
Space Complexity: O(N)
*/
