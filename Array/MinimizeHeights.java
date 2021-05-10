// Minimize the heights...Find out what could be the possible minimum difference of the heights of sortest and longest towers
import java.util.*;
class MinimizeHeights
{
    static int getMinDiff(int a[],int k)
    {
        int n=a.length;
           Arrays.sort(a);
           int ans=a[n-1]-a[0];
           int small=a[0]+k;
           int large=a[n-1]-k;
           int min=0;
           int max=0;
           for(int i=0;i<n-1;i++)
           {
               min=Math.min(small,a[i+1]-k);
               max=Math.max(large,a[i]+k);
               if(min<0)continue;
               ans=Math.min(ans,max-min);
           }

           return ans;
    }
    public static void main(String args[])
    {
        int a[]={1,5,8,10};
        int k=2;
        System.out.println("Minimum height between the longest and sortest towers:"+getMinDiff(a,k));
    }
}