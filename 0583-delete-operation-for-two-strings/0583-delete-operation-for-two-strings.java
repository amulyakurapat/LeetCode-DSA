class Solution {
    public int minDistance(String word1, String word2) {
       int[][] dp=new int [word1.length()][word2.length()];
       for(int[] row:dp)
       {
        Arrays.fill(row,-1);
       } 
       int m=word1.length();
       int n=word2.length();
       return m+n-2*LCS(0,0,word1,word2,dp); 
    }
    public int LCS(int i, int j, String s1,String s2, int[][] dp)
    {
        if(i>=s1.length()||j>=s2.length())
        return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]= 1+LCS(i+1,j+1,s1,s2,dp);
        }
        else 
        {
            return dp[i][j]=Math.max(LCS(i,j+1,s1,s2,dp),LCS(i+1,j,s1,s2,dp));
        }
    }
}