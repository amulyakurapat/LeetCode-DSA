class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        for(int num : nums) {
            if(num==1) {
                sum++;
            } else{
                sum = 0;
            } 
            max = Math.max(sum,max);
        }
        return max;
    }
}