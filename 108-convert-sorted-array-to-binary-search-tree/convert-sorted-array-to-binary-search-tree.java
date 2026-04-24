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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
         return FormBST(nums,0,nums.length-1);
       
    }
    public static TreeNode FormBST(int arr[],int start,int end){
        if(start>end) return null;
        int middle=(start+end)/2;
        TreeNode root=new TreeNode(arr[middle]);
        root.left=FormBST(arr,start,middle-1);
        root.right=FormBST(arr,middle+1,end);
        return root;
    }
}