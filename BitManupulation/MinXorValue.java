// Find the pair whose xor value is minimum.Find that xor value.
import java.util.*;
class MinXorValue
{
    static int minXor(int a[])
    {
       Arrays.sort(a);
       int sum=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<a.length-1;i++)
       {
         sum=a[i]^a[i+1];
         min=Math.min(sum,min);

       }

       return min;
    }
    public static void main(String arga[])
    {
        int a[]={0,4,3,2,5};
        System.out.println("Minimum xor value is:"+minXor(a));
    }
}