// Given a string str we need to tell minimum characters to be added at front of string to make string palindrome.
// T(c)=o(n)
// space=o(1)
import java.util.*;
class MakeStringPalin
{
    static int makePalin(String s)
    {
        int i=0;
        int j=s.length()-1;
        int count=0;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                count++;
                j--;
            }
            else
            {
                i++;
                j--;
                }
        }
       return count;
    }
  public static void main(String args[])
  {
      String s="AACECAAAA";
     System.out.println("Count="+makePalin(s));
      
  }
}