// find the length of the longest prefix which is also a longest suffix.here prefix and suffix are also overlap.
// This algo are also known as Knuth-Morries-pratt algorithm
// T(c)=o(n)
// space=o(n)
class LongestPrefixSuffix
{
    static int findPrefixSuffix(String s)
    {
        int i=0;
        int j=i+1;
        int n=s.length();
        int a[]=new int[n];
        while(j<n)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                a[j]=i+1;
                i++;
                j++;
            }
            else{
                if(i>0)
                i=a[i-1];

                else
                {
                a[j]=0;
                j++;
                }
            }
        }
        return a[n-1];
    }
    public static void main(String args[])
    {
        String s="abab";
        System.out.println("Longest prefix is:"+findPrefixSuffix(s));
    }
}