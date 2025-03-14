class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,window=0,ans=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            window += nums[right];
        
        while(window>=target){
            ans = Math.min(ans,right-left+1);
            window -= nums[left++];

        }
    }
    return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}