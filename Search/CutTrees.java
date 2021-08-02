// Cut the Trees
// t(c)=0(nlogn)
// space=o(1)
import java.util.*;
class CutTrees
{
    static int maxHeight(int a[],int m)
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
           max=Math.max(a[i],max);
        }
        int low=0;
        int high=max;
        int res=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(canWeCut(mid,m,a))
            {
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }

    static boolean canWeCut(int mid,int m,int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>mid)
            {
                sum+=a[i]-mid;
            }
        }
        return(sum>=m);
    } 
    public static void main(String[] args) {

        // int a[]={4,26,40,42,46};
        int a[]={20,15,10,17};
        int m=7;
        System.out.println(maxHeight(a,m));
    }
}