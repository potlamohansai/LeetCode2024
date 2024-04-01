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
    int counter;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null && preorder.length == 0){
            return null;
        }
        counter = 0;
        return construct(preorder, Integer.MAX_VALUE);
    }

    private TreeNode construct(int[] preorder, int bound){
        // check for the size of array or value is max than bound
        if(counter == preorder.length || preorder[counter] > bound){
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[counter++]);
        node.left = construct(preorder, node.val);
        node.right = construct(preorder, bound);
        return node;
    }
}


/*
The time complexity of the provided code is O(n), where n is the number of elements in the preorder array.
This is because each element in the array is visited exactly once, and for each element, constant time operations are performed.

The space complexity is also O(n) due to the recursive calls on the call stack.
The recursion depth could be as deep as the height of the tree, which is O(n) in the worst case for an unbalanced tree.
Additionally, there's no extra space usage dependent on the input size beyond the recursion stack.
Therefore, both time and space complexities are linear with respect to the size of the input array.
*/
