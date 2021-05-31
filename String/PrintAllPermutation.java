// T(c)=o(n*n!)
// Space=o(n);
// Note there are n! permutations and it requires to print a number in o(n) time.

import java.util.*;
{
    static List<String> l1=new ArrayList<>();
    static List<String> printPermutation(String s,int l,int r)
    {
           if(l==r)
           {
               l1.add(s);
            //    return;
           }
           else
           {
               for(int i=l;i<=r;i++)
               {
                   s=swap(s,l,i);
                   printPermutation(s,l+1,r);
                   s=swap(s,l,i);
               }
           }

           return l1;
    }

    static String swap(String s,int l,int h)
    {
        char c[]=s.toCharArray();
        char temp=c[l];
        c[l]=c[h];
        c[h]=temp;
        return String.valueOf(s);
    }
    public static void main(String args[])
    {
        String s="ABC";
        int n=s.length();
        System.out.println("All Permutation is:"+printPermutation(s,0,n-1));
    }
}