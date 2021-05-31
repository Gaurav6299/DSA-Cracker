// Split the String into number of substring that will contains a equal number of 0 and 1.your task is to count the number of substring.
// T(0)=o(n);
// space=o(1)
// Note:- if I want to display the substring that will contains equal number of 0 and 1
import java.util.*;
class SplitBinaryString
{
    static int splitBinary(String s)
    {
        // ArrayList<String> l=new ArrayList<>();
        int n=s.length();
        int count=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++)
        {
           
           if(s.charAt(i)=='0')
           {
               c1++;
           }
           else if(s.charAt(i)=='1')
           {
               c2++;
           }

           if(c1==c2)
           {
               count++;
           }
        }
        System.out.println("The Substring is:"+l);
        if(count==0)
        return -1;
        return count;
    }
    public static void main(String args[])
    {
        String s="0100110101";
        System.out.println("Number of Substring is:"+splitBinary(s));
    }
}