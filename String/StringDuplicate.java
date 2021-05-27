// Write an effiecient program to print the duplicate characters and their count

// Why strings are immutable in java?
// String is immutable in java because String objects are cached inside the string pooled are.
import java.util.*;
class StringDuplicate
{
    static void findDup(String s)
    {
        //========= First Method============
        // T(c)=o(n)
        // space=o(n)
        // Map<Character,Integer> m=new HashMap<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(char c:m.keySet())
        // {
        //     if(m.get(c)>1)
        //     {
        //         System.out.println(c+"="+m.get(c));
        //     }
        // }


//========= Second Method===============
// T(c)=o(n)
        int count[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
         
         for(int i=0;i<count.length;i++)
         {
            if(count[i]>1)
            {
                System.out.println((char)i+" "+count[i]);
            }
         }
    }
    public static void main(String args[])
    {
        String s="geeksforgeeks";
        findDup(s);
    }
}