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
    public int countNodes(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return 0;
        }
        preorder(root,list);
        return list.size();
    }
       

        
        public static void preorder(TreeNode root,List<Integer>l)
        {
            if(root==null) return ;
          
            l.add(root.val);
            preorder(root.left,l);
            preorder(root.right,l);



        }
    }

