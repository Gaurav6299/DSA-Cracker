// Find the length of the longest substring that does not contans a duplicate character.
// T(c)=o(n^2)
// space=o(n)
import java.util.*;
class LongestSubstringCharacters
{
     static int lengthOfLongestSubstring(String s) {
        
        // int max=Integer.MIN_VALUE;
        // if(s.length()==1)
        //     return s.length();
        // else if(s.length()==0)
        //     return 0;
        // for(int i=0;i<s.length();i++)
        // {
        //   List<Character> l=new ArrayList<>();
        //   int j=i;
        //     while(j<s.length())
        //     {
        //         if(!l.contains(s.charAt(j)))
        //         {
        //             l.add(s.charAt(j));
        //             j++;
        //         }
        //         else
        //             break;
        //     }
            
        //     max=Math.max(max,l.size());
        // }
        // return max;

        // Second method
        // T(c)=o(n)
        // space=o(n)
        Set<Character> set=new HashSet<>();
        int i=0;   //left pointer
        int j=0;   //right pointer
        int max=Integer.MIN_VALUE;
        if(s.length()==0)
        return 0;
        while(j<s.length())
        {
         char c=s.charAt(j);
            if(set.add(c))
            {
                max=Math.max(max,(j-i)+1);
                j++;
            }
            else{
                while(s.charAt(i)!=c)
                {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(c);
                i++;
            }
        }
       
        return max;
        
    }
    public static void main(String args[])
    {
        String s="tmmzuxt";
        System.out.println("Longest substring length:"+lengthOfLongestSubstring(s));

    }
}