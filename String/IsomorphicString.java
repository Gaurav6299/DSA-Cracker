// Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
// Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
// Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’

import java.util.*;
class IsomorphicString
{
    static boolean isomorphic(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();

         if(n!=m)
         return false;

         int a[]=new int[256];
         int b[]=new int[256];
         for(int i=0;i<n;i++)
         {
             if(a[s1.charAt(i)]==0 && b[s2.charAt(i)]==0)
             {
                 a[s1.charAt(i)]=s2.charAt(i);
                 b[s2.charAt(i)]=s1.charAt(i);

             }
             else if(a[s1.charAt(i)]!=s2.charAt(i))
             return false;
         }

         return true;
    }
    public static void main(String args[])
    {
        String s1="aab";
        String s2="xxz";
       System.out.println("Is it isomorphic: "+isomorphic(s1,s2));
    }
}