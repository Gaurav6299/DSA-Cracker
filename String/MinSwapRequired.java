import java.util.*;
class MinSwapRequired
{
    static int minSwap(String s)
    {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                l.add(i);
            }
        }

        int count=0;
        int p=0;
        int sum=0;  //it will stored the number of swap as a result
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i]=='[')
            {
                count++;
                p++;
            }

            else if(c[i]==']')
            count--;

            if(count<0)
            {
                sum+=l.get(p)-i;
                char temp=c[i];
                c[i]=c[l.get(p)];
                c[l.get(p)]=temp;
                p++;
                count=1;

            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        String s="[]][][";
        System.out.println("Minimum swaps is:"+minSwap(s));
    }
}