class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        while(l<r){
            int sma = Math.min(height[l],height[r]);
            int area= sma*(r-l);
            if(area>max){
                max = area;
            }
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}