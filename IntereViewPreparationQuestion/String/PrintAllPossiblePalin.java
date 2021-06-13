// Print All Possible palindrome of a given string
import java.util.*;
class PrintAllPossiblePalin
{
    static List<String> l=new ArrayList<>();
    static List<String> printAllPalin(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                String k=s.substring(i,j);
               if(isPalin(k)==true)
               {
                   l.add(k);
                   System.out.println(k);
               }
            }

        }
        return l;
    }

    static  boolean isPalin(String k)
    {
         int i=0;
         int j=k.length()-1;
         while(i<=j)
         {
             if(k.charAt(i)!=k.charAt(j))
             {  
                 return false;
             
             }

             i++;
             j--;
         }
         return true;
    }
    public static void main(String args[])
    {
    String s="nitin";
    List<String> l1=printAllPalin(s);
    System.out.println(l1);
}
}