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
    public boolean checkSymmetric(TreeNode x,TreeNode y){

        if(x==null && y==null) return true;
        if(x!=null && y==null) return false;
        if(y!=null && x==null) return false;

        if(x.val!=y.val) return false;
       return checkSymmetric(x.left,y.right )&& checkSymmetric(x.right,y.left);
    }

    public boolean isSymmetric(TreeNode root) {
        boolean result=checkSymmetric(root.left,root.right);
        return result;
    }
}