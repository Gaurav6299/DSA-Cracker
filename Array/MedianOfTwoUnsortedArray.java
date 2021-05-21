//Find the medain of two sorted Array..of unequal size.
//time complexity will be T(c)=0((n+m)log(n+m))
//space complexity 0(n+m);
import java.util.*;
class MedianOfTwoUnsortedArray
{
    static int  medianOfUnsortedArray(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;
        int i=n-1;
        int j=0;
        while(i>=0 && j<m)
        {
            if(a[i]>b[j])
            {
                int temp=a[i];
                a[i]=b[j];
                [j]=temp;
                i--;
                j++;
            }
            else
            break;
        }

        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:a)
        {
            l.add(x);
        }
        for(int y:b)
        {
            l.add(y);
        }

      
       int x=0;
       int y=l.size()-1;
       int mid=(x+y)/2;
       if(l.size()%2==0)
       {
           int median=(l.get(mid)+l.get(mid+1))/2;
           return median;
       }
       int median=l.get(mid);
       return median;
    }
    public static void main(String args[])
    {
        int a[]={-5,3,6,12,15};
        int b[]={-12,-10,-6,-3,4,10};
        System.out.println("Medain of Two Unsorted Array is:"+medianOfUnsortedArray(a,b));
    }
}