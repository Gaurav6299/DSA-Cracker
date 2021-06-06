// Find the minimum number of reversals are required to convert the string into a balanced expression
import java.util.*;
class CountReversals
{
    static int reversalsCount(String s)
    {
        Stack<Character> st=new Stack<>();
        if(s.length()%2!=0)
        return -1;


        int c1=0;  // {
        int c2=0;  // }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='{')
           {
               st.push(s.charAt(i));
               c1++;
           }
           else if((s.charAt(i)=='}') && (!st.isEmpty()) && (st.peek()=='{'))
           {
               st.pop();
               c1--;
           }
           else
           c2++;

        }

        if(c1%2!=0)
        c1=c1/2+1;  //here we will take a ceil value if c1( { ) count is odd
        else
        c1=c1/2;

        if(c2%2!=0)
        c2=c2/2+1; //here we will also take a ceil value if c2( } ) count is odd
        else
        c2=c2/2;

        count=c1+c2;
        return count;
    }
   public static void main(String args[])
   {
       String s="}{{}}{{{";
       System.out.println("Minimum reversals is:"+reversalsCount(s));
   }
}