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
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        Stack<TreeNode> stack = new Stack();
        int sum = 0; 
        stack.push(root);
        TreeNode currNode = null;
        
        while (!stack.isEmpty()){
            currNode = stack.pop();
            
            if (L <= currNode.val && currNode.val <= R) sum += currNode.val;
            
            if (currNode.left != null) stack.push(currNode.left);
            if (currNode.right != null) stack.push(currNode.right);
        }
        
        return sum;
        
        
    }
}

// Time complexity: O(n) where n = number of nodes in the tree.
// Space complexity: O(H) where H = height of the tree.