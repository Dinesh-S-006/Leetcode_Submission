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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
      int value=root.val;

        
         boolean output= prerder(root,value);
         return output;}

        public boolean prerder(TreeNode root,int v)
        {
           
          //  prerder(root.left,v);
          if(root==null) return true;
            if(root.val!=v)
            {
                return false;
            }
            if(!prerder(root.left,v)) return false;
            if(!prerder(root.right,v)) return false;


           return true;
        }


    }
