// Find the Kth greatest Element
import java.util.*;
class KthGreatestElement
{
    static int kthGreatest(int a[],int k)
    {
        int n=a.length;
        Arrays.sort(a);
        int i=0;
        while(i<n-k)
        {  
             i++; 
        }

        return a[i];

    }
    public static void main(String args[])
    {
        int a[]={7,10,4,3,15,20};
        int k=2;
        int y=kthGreatest(a,k);
        System.out.println("Kth Greatest element is:"+y);
    }
}