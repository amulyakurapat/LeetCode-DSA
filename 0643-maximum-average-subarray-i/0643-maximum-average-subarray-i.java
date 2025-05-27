class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int res=0,as=0;
        for(int i=0;i<k;i++){
            as+=nums[i];
        }
        res=as;
        for(int i=k;i<nums.length;i++){
             as += nums[i] - nums[i-k];
            res = Math.max(res,as);
        }
        return (double) res/k;
    }
}