class LongestCommonSubsequence
{
    static int findCommon(String s1,String s2)
    {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=dp.length-2;i>=0;i--)
        {
            for(int j=dp[0].length-2;j>=0;j--)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    dp[i][j]=dp[i+1][j+1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String args[])
    {
        String s1="AGGTAB";
        String s2="GXTXAYB";
        System.out.println("Longest Common Subsequence:"+findCommon(s1,s2));
    }
}