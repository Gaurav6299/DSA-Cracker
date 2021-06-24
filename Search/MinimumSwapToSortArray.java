// Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.
import java.util.*;
class MinimumSWapToSortArray
{
    static int minimumSwap(int a[])
    {
        int n=a.length;
        int ans=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        boolean b[]=new boolean[n];

        for(int i=0;i<n;i++)
        {
            m.put(a[i],i);
        }
        Arrays.sort(a);

        for(int i=0;i<n;i++)
        {
            if(b[i] || m.get(a[i])==i)   //If map value ==i index that means element is placed at the right index
            continue;

            int j=i;
            int count=0;
            while(!b[j])
            {
                b[j]=true;
                j=m.get(a[j]);
                count++;
            }
            if(count>0)
            {
                ans+=count-1;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int a[]={2,8,5,4};
        System.out.println("Minimum Number of swap:"+minimumSwap(a));
    }
}