// T(c)=o(nlogn)
import java.util.*;
class MergeSort
{
    static void mergeArray(int a[],int l,int h)
    {
        if(l<h)
        {
            int mid=(l+h)/2;
            mergeArray(a,l,mid);
            mergeArray(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    static void merge(int a[],int l,int mid,int h)
    {
       int i=l;
       int j=mid+1;
       int k=l;
       int b[]=new int[a.length];
       while(i<=mid && j<=h)
       {
           if(a[i]<=a[j])
           {
               b[k]=a[i];
               i++;
           }
           else{
               b[k]=a[j];
               j++;
           }
           k++;
       }

       if(i>mid)
       {
           while(j<=h)
           {
               b[k]=a[j];
               k++;
               j++;
           }

       }
       else{
           while(i<=mid)
           {
               b[k]=a[i];
               i++;
               k++;
           }
       }
      
      for(int t=l;t<=h;t++)
      {
          a[t]=b[t];
      }
       
    }
    public static void main(String arg[])
    {
        int a[]={12,1,2,3,11,7};
        mergeArray(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}