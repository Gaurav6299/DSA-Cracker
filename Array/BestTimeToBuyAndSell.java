// Best Time To Buy And Sell...
// FirstSolution... 
import java.util.*;
class BestTimeToBuyAndSell
{
    static int buyAndSell(int a[])
    {
        int n=a.length;
        int b[]=new int[n];
        int k=b.length-1;
        int max=0;
        for(int i=n-1;i>=0;i--)
        {
            max=Math.max(max,a[i]);
            b[k]=max;
            k--;
        }
        int i=0;
        int j=0;
        int maxP=0;
        while(i<n && j<b.length)
        {
            maxP=Math.max(maxP,b[j]-a[i]);
            i++;
            j++;
        }

        return maxP;
    }
    public static void main(String args[])
    {
        // int a[]={7,1,5,3,6,4};
        int a[]={7,6,4,3,1};
        System.out.println(buyAndSell(a));
    }
}