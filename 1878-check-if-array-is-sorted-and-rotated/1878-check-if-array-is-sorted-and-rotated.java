class Solution {
    public boolean check(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                ans++;
                if(ans>1){
                    return false;
                }
            }
        }
       return true;
    }
}