class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=nums.length-1;i>0;i--)
        {
            rightSum+=nums[i];
        }
        if(leftSum==rightSum) return 0;
        for(int i=1;i<nums.length;i++)
        {
            rightSum-=nums[i];
            leftSum+=nums[i-1];
            if(leftSum==rightSum) return i;
        }
        return -1;
    }
}