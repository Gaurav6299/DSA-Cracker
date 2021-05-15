import java.util.*;
class Merge1
{
    static void mergeSortt(int a[],int l,int h)
    {
        if(l<h)
        {
            int mid=(l+h)/2;
            int c=0;
            mergeSortt(a,l,mid);
            mergeSortt(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }

    static void merge(int a[],int l,int mid,int h)
    {
        int i=l;
        int j=mid+1;
        int k=l;
        int n=a.length;
        int b[]=new int[n];

        while(i<=mid && j<=h)
        {
         if(a[i]<a[j])
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
            k++;
            i++;
        }
    }

    for(int x=l;x<=h;x++)
    {
        a[x]=b[x];
    }

}

static void print(int a[])
{
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
}
    
    public static void main(String args[])
    {
        int a[]={2,4,1,3,5};
        int n=a.length;
        mergeSortt(a,0,n-1);

        print(a);
        
    }
}