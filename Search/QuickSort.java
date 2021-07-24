// T(c)=o(nlogn)
class QuickSort
{
    static void quickSearch(int a[],int l,int h)
    {
        if(l<h)
        {
            int pivot=partition(a,l,h);
            quickSearch(a,l,pivot-1);
            quickSearch(a,pivot+1,h);
        }
    }
    static int partition(int a[],int l,int h)
    {
        int pivot=a[l+(h-l)/2];
        int i=l;
        int j=h;
        while(i<j)
        {
            while(a[i]<=pivot)i++;
            while(a[j]>pivot)j--;
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        int temp=a[j];
        a[j]=pivot;
        pivot=temp;
        return j;
    }
    public static void main(String args[])
    {
        int a[]={10,4,2,11,12,20,22};
        int n=a.length;
        quickSearch(a,0,n-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}