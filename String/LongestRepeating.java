// Find the length of the longest Repeating Subsequence in a String..Two subsequence have the same character but should not present in the same position.
// T(c)=n(n^2)
// Space=o(n^2)
class LongestRepeating
{
    static int longest(String s)
    {
        String k=s;
        int n=s.length();
        int out[][] =new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==k.charAt(j-1) && i!=j)
                {
                    out[i][j]=out[i-1][j-1]+1;
                }
                else
                {
                    out[i][j]=Math.max(out[i-1][j],out[i][j-1]);
                }
            }
        }

        return out[n][n];

    }

   
    public static void main(String args[])
    {
        String s="axxxb";
        int y=longest(s);
        System.out.println("Longest Repeating Subsequence is:"+y);
    }
}