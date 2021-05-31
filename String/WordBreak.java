// Given a string A and a dictionary of n words B, find out if A can be segmented into a space-separated sequence of dictionary words. 
// ==============================Or==================================
// The segmentation of given string is present inside the distionary or not.. if present returns 1 otherwise 0.
// T(c)=o(n^2)
// Space=o(n);
import java.util.*;
class WordBreak
{
    static Map<String,Integer> m=new HashMap<>();  //here we are using map as a dynamic programming
    static int word(String s,ArrayList<String> l)
    {
        if(l.contains(s))
        return 1;

        if(m.containsKey(s))
        return m.get(s);

        for(int i=1;i<=s.length();i++)
        {
            String left=s.substring(0,i);
            if(l.contains(left) && word(s.substring(i),l)==1)
            {
                m.put(s,1);
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        String s="leetcode";
        ArrayList<String> l=new ArrayList<>(Arrays.asList("leet","code"));
        System.out.println(word(s,l));
    }
} 