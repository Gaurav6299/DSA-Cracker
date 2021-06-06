// Search the pattern in the given text and if pattern is found then it will return the index of that pattern
import java.util.*;
class RabinKarpAlgo
{
    static int d=256;  //no_of_char
    static void search(String text,String pat,int q)
    {
        int m=text.length();
        int n=pat.length();
        int i,j;
        int p=0;
        int t=0;
        int h=1;

        for(i=0;i<n-1;i++)
        {
            h=(h*d)%q;
        }

        // Find hash value for pattern and text
        for(i=0;i<n;i++)
        {
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+text.charAt(i))%q;

        }

for(i=0;i<=m-n;i++)
{
        if(p==t)
        {
            for(j=0;j<n;j++)
            {
                if(text.charAt(i+j)!=pat.charAt(j))
                break;
            }

            if(j==n)
            {
                System.out.println("elemnt found at Index: " +i);
            }
        }
 
 //calculate hash value for next windows of text..remove trailing character and add leading character
        else{
                t=(d*(t-text.charAt(i)*h)+text.charAt(i+n))%q;
                if(t<0)
                t=(t+q);
        }

}

    }
        
 public static void main(String args[])
 {
     String text="AABAACAADAABAABA";
     String pat="AABA";
     int q=101;  //I will take prime number for our hash Function
    
     search(text,pat,q);
 }
}