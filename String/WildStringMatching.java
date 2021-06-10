// Given two strings wild and pattern where wild string may contain wild card characters and pattern string is a normal string. Determine if the two strings match. The following are the allowed wild card characters in first string :-
// * --> Matches with 0 or more instances of any 
// character or set of characters.
// ? --> Matches with any one character.
class WildStringMatching
{
    static boolean matchString(String wild,String pattern)
    {
        boolean dp[][]=new boolean[wild.length()+1][pattern.length()+1];
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i==dp.length-1 && j==dp[0].length-1)
                {
                       dp[i][j]=true;
                }
                else if(i==dp.length-1)
                dp[i][j]=false;

                else if(j==dp[0].length-1)
                {
                    if(wild.charAt(i)=='*')
                    {
                        dp[i][j]=dp[i+1][j];
                    }else{
                        dp[i][j]=false;
                    }
                }
                else{
                    if(wild.charAt(i)=='?')
                    {
                      dp[i][j]=dp[i+1][j+1];    //diagonally
                    }
                    else if(wild.charAt(i)=='*')
                    {
                      dp[i][j]=dp[i+1][j] || dp[i][j+1];
                    }

                    else if(wild.charAt(i)==pattern.charAt(j))
                    {
                     dp[i][j]=dp[i+1][j+1];
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String args[])
    {
    String  wild = "ge?ks*";
    String  pattern = "geeksforgeeks";
    System.out.println("Is it match:"+matchString(wild,pattern));
}
}