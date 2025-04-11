class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        return numSquaresMem(n,dp);
    }
    public int numSquaresMem(int n,int[] dp)
    {
        if(n==0)
        {
            return 0;
        }
        dp[0]=0;
        for(int i=1;i<=n;i++) //traversing the dp array
        {
            for(int j=1;j*j<=i;j++) //filling the arrya
            {
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
    
}