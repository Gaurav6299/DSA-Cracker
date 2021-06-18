class LongestCommonSubsequence

{
    static int findLongestSubseuquenceLength(String s1,String s2)
    {
        int a[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=a.length-2;i>=0;i--)
        {
            for(int j=a[0].length-2;j>=0;j--)
            {
                char c1=s1.charAt(i);
                char c2=s2.charAt(j);
                if(c1==c2)
                {
                    a[i][j]=1+a[i+1][j+1];
                }else
                {
                    a[i][j]=Math.max(a[i][j+1],a[i+1][j]);
                }
            }
        }
        return a[0][0];
    }
  public static void main(String args[])
  {
     String s1="ABCDGH";
     String s2="AEDFHR";
     System.out.println("Length is:"+findLongestSubseuquenceLength(s1,s2));
  }
}