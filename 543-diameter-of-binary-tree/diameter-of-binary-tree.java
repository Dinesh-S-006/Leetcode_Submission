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
        int Diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
      

      heightFinder(root);
     return Diameter;

    }
    public  int heightFinder(TreeNode root)
    {
        if(root==null)
        {
            return 0;

        }
        int left=heightFinder(root.left);
        int right=heightFinder(root.right);
        Diameter=Math.max(Diameter,(left+right));
        return 1+Math.max(left,right);
    }
}