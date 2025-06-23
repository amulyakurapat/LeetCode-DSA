class Solution {
    public int trap(int[] height) {
       int n = height.length;
       int pref[] = new int [n];
       int suff[] = new int[n];
       pref[0] = height[0];
       for(int i = 1;i<n;i++)
       {
        pref[i] = Math.max(pref[i-1],height[i]);
       }
       suff[n-1] = height[n-1];
       for(int i = n-2;i>=0;i--){
        suff[i] = Math.max(suff[i+1],height[i]);
       }
       int wt = 0;
       for(int i = 0;i<n;i++){
       wt += Math.min(pref[i],suff[i]) - height[i];
       }
       return wt;
    }
    
}