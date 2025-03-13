class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=Integer.MIN_VALUE;
        int lsum = 0;
        int rsum = 0;
        for(int i=0;i<k;i++){
             lsum = lsum + cardPoints[i];
        }
        sum=lsum;
        int rightIndex = cardPoints.length - 1;
        for(int i=k-1;i>=0;i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rightIndex];
            sum = Math.max(sum,lsum+rsum);
            rightIndex--;

        }
        return sum;
    }
}