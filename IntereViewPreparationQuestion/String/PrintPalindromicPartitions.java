// Given a string, print all possible palindromic partitions..
// Means jo jo palindrome h sirf usko partition karo. us given String se.
class PrintPalindromicPartitions
{
    static boolean isPalin(String k)
    {
        int i=0;
        int j=k.length()-1;
        while(i<=j)
        {
            if(k.charAt(i)!=k.charAt(j))
            return false;

            i++;
            j--;
        }

        return true;
    }
    static void partitionPalin(String s,String ans)
    {
          if(s.length()==0)
            {
                System.out.println(ans);
                return;
            }
        for(int i=0;i<s.length();i++)
        {
            String left=s.substring(0,i+1);
            String res=s.substring(i+1);
            if(isPalin(left))
            {
                partitionPalin(res,ans+" "+left+" ");
            }
        }
    }
    public static void main(String args[])
    {
        String s="nitin";
        partitionPalin(s,"");
    }
}