class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1;
        int ans = Integer.MAX_VALUE;
        for(int pile : piles){
            high = Math.max(high,pile);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            double total = 0;
           for(int pile : piles){
             total += Math.ceil((double) pile/mid);
           }
          if(total>h){
            low = mid+1;
          } else{
            ans = mid;
            high = mid - 1;
          }
            
        }
        return ans;
    }
}