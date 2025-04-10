class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp,0);
        return combinationSum4mem(nums,target,dp);
    }
    public int combinationSum4mem(int[] nums,int target,int[] dp){
        if(target==0) return 1;
        if(target<0) return 0;
        dp[0] = 1;
        for(int i=1;i<=target;i++){
            for(int j =0;j<nums.length;j++){
                if(i-nums[j]>=0)
                dp[i]+=dp[i-nums[j]];
            }
        }
        return dp[target];
    }
}