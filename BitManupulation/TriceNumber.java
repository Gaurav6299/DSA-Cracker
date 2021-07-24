// Given an array That contains all the number thrice, and one non repeating element is present.Your task is find that number.
import java.util.*;
class TriceNumber
{
    static int countNon(int a[])
    {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int sum=0;
            for(int j=0;j<a.length;j++)
            {
                int res=a[j];
                int k=res>>i;
                if((k&1)==1)
                {
                    sum++;
                }
            }
            sum%=3;
            if(sum!=0)
            {
                ans|=sum<<i;
            }
        }
        return ans;
}
     public static void main(String arg[])
   {
     int a[]={-2,-2,1,1,4,1,4,4,-4,-2};
     System.out.println(countNon(a));
 }
}
