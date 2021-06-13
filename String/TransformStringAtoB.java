// Given two strings A and B, the task is to convert A to B if possible. The only operation allowed is to put any character from A and insert it at front. Find if it’s possible to convert the string. If yes, then output minimum no. of operations required for transformation.
// T(c)=o(n)
// space=o(1);
import java.util.*;
class TransformStringAtoB
{
    static int convertS1toS2(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        return -1;

        //here we check wheather String s1 is transformed to s2 or not by the help of array.
        // In array if both string character frequancy is zero so we can say that String s1 is transformed to s2.
        int a[]=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            return -1;
        }

        int i=s1.length()-1;
        int j=s2.length()-1;
        int count=0;
        while(i>=0)
        {
            if(s1.charAt(i)!=s2.charAt(j))
            count++;

            else{
                j--;
            }

            i--;
        }
       return count;
    }
    public static void main(String args[])
    {
        String s1="EACBD";
        String s2="EABCD";
        System.out.println("Transform count is:"+convertS1toS2(s1,s2));
    }
}