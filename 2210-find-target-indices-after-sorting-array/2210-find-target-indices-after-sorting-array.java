class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         Arrays.sort(nums);
        LinkedList<Integer> in = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
            in.add(i);
        }
        }
    return in;

    }
    
}