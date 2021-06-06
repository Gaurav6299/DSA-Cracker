// Find the Longest Common prefix amongest an array of string.
// If there is no common prefix return "".
// T(c)=o(N*M)
// space=o(1)
// where N=Length of the Array
// M=Length of the longest string
class FindCommonPrefix
{
    static String findCommonPrefix(String s[])
    {
        String y=s[0];
        int min=Integer.MAX_VALUE;
        if(s.length==0)
        return "";
        for(int i=1;i<s.length;i++)
        {
            int j=0;
            int k=0;
            int len=0;
            while(j<y.length() && k<s[i].length())
            {
                if(y.charAt(j)==s[i].charAt(k))
                len++;

                else
                break;

                j++;
                k++;
            }
            min=Math.min(min,len);
        }
        return y.substring(0,min);
    }
    public static void main(String args[])
    {
        String s[]={"flower","flow","flight"};
        System.out.println("Longest common prefix is:"+findCommonPrefix(s));
    }
}