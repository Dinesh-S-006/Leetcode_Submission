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
       List< List<Integer>> list=new ArrayList<>();
       if(root==null)
       {
        return list;
       }
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       boolean haszigzag=false;
       while(!queue.isEmpty())
       {
        List<Integer> l=new ArrayList<>();
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
            TreeNode curr=queue.poll();
            l.add(curr.val);
            if(curr.left!=null)
            {
               // l.add(curr.left.val);
                queue.add(curr.left);
            }
            if(curr.right!=null)
            {
               // l.add(curr.right.val);
                queue.add(curr.right);
            }}

            if(haszigzag){
                Collections.reverse(l);
            }
            haszigzag=!haszigzag;
            list.add(l);



        }
        return list;

       }






    }
