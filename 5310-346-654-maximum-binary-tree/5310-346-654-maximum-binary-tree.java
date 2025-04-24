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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums==null){
            return null;
        }
        return build(nums,  0, nums.length-1);
    }


    private TreeNode build (int [] nums, int start, int end){
        if (start>end){
            return null;
        }

        int imax = start;
        for (int i = start+1; i<=end; i++){
            if (nums[i]>nums[imax]){
                imax = i;
            }
        }
        TreeNode root = new TreeNode (nums[imax]);
        root.left = build (nums, start, imax-1);
        root.right =  build (nums, imax+1, end);
         return root;
    }
   
}