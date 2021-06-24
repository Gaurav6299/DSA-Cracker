// Given an array Find the First and last Occurrences of the given  element inside the array.
// T(c)=o(logn);
import java.util.*;
class PrintFirstAndLast
{
    static ArrayList<Integer> findFirstAndLast(int a[],int x)
    {
        int n=a.length;
        int low=0;
        int high=n-1;
        int res=-1;
        ArrayList<Integer> l=new ArrayList<>();
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(x==a[mid])
            {
                res=mid;
                high=mid-1;
            }
            else if(x<a[mid])
            {
                high=mid-1;
            }
            else
            low=mid+1;

        }
        l.add(res);
        
        res=-1;
        low=0;
        high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(x==a[mid])
            {
                low=mid+1;
                res=mid;
            }
            else if(x<a[mid])
            {
                high=mid-1;
            }
            else
            low=mid+1;
        }
        l.add(res);
        return l;
    }
    public static void main(String args[])
    {
        int a[]={1,3,5,5,5,5,67,123,125};
        int x=5;
        System.out.println("First and last Occurrences:"+findFirstAndLast(a,x));
    }
}