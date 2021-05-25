// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

class ReverseStringll
{
    static String reverseStr(String s,int k)
    {
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i+=2*k)
        {
             int j=i+k-1;
             if(j>=c.length)
             {
                 j=c.length-1;
                 reverse(i,j,c);
             }
             else
             {
                 reverse(i,j,c);
             }
        }
        return String.valueOf(c);
    }

    static void reverse(int i,int j,char c[])
    {
        while(i<=j)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;

        }
    }
    public static void main(String args[])
    {
        String s="abcdefg";
        int k=2;
        System.out.println("Reverse String is:"+reverseStr(s,k));
    }
}