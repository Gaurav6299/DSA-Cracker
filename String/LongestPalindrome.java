// find the longest palindrome in a string[Longest Palindromic Substring]
// T(c)=o(n^2);
// space=o(1)
class LongestPalindrome
{
    static void findLongPalin(String s)
    {
        int start=0;
        int len=s.length();
        int low,high;
        int maxlen=1;

        // first we find the even length palindrome
        for(int i=1;i<len;i++)
        {
            low=i-1;  
            high=i;
            while(low>=0 && high<len  && s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>maxlen)
                {
                    start=low;
                    maxlen=high-low+1;
                }
                low--;
                high++;
            }

       //find the odd length palindrome
            low=i-1;
            high=i+1;
            while(low>=0 && high<len && s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>maxlen)
                {
                    start=low;
                    maxlen=high-low+1;
                }
                low--;
                high++;
            }
        }

        longPalin(s,start,start+maxlen);
    }

    static void longPalin(String s,int start,int len)
    {
        String y=s.substring(start,len);
        System.out.println(y);
    }
    public static void main(String args[])
    {
        String s="aaaabbaa";
        findLongPalin(s);
        
    }
}