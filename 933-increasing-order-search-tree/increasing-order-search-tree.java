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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> l=new ArrayList<>();
         Inorder(root,l);
            System.out.println(l);
         TreeNode output=Build_Tree(l);
         return output;


    }

        public static void Inorder(TreeNode root,List<Integer>list)
        {
            
            if(root==null)
            {
                return;
            }
            Inorder(root.left,list);
            list.add(root.val);
            Inorder(root.right,list);
            
           // return list;}
        }

        public static TreeNode Build_Tree(List<Integer>l)
        {
          
           TreeNode root=new TreeNode(l.get(0));
           TreeNode curr=root;
           for(int i=1;i<l.size();i++)
           {
            curr.right=new TreeNode(l.get(i));
            curr=curr.right;
           }
            return root;
        }


            
        }
        
     

    
