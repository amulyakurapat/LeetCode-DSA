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


class Solution{
    public TreeNode balancedBST(int nums[],int si,int ed){
        if(si>ed) return null;
        int mid = (si+ed)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = balancedBST(nums,si,mid-1);
        root.right = balancedBST(nums,mid+1,ed);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums){
        return balancedBST(nums,0,nums.length-1);
    }
}