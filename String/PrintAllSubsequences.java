// Find all the subsequences of a given String..
// T(c)=o(n) because recursive function time complexity is linear which is called o(n)
import java.util.*;
class PrintAllSubsequences
{
    static List<String> l=new ArrayList<>();
    static void findSubsequence(String s,String ans)
    {
        if(s.length()==0)
        {
            l.add(ans);
            return;
        }
        findSubsequence(s.substring(1),ans+s.charAt(0));
        findSubsequence(s.substring(1),ans);
    }
        public static void main(String args[])
    {
        String s="abc";
        findSubsequence(s,"");
        System.out.println("All Subsequence is:"+l);
    }
}