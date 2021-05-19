//Three Way to partitioning  an array
// Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
// 1) All elements smaller than a come first.
// 2) All elements in range a to b come next.
// 3) All elements greater than b appear in the end.
// The individual elements of three sets can appear in any order. You are required to return the modified array.

class ThreeWayPartitioning
{
    static void ParttioningArray(int a[],int n,int x,int y)
    {
        int i=0;
        int j=n-1;
        int k=0;
        while(k<=j)
        {
            if(a[k]<x)
            {
                int temp=a[k];
                a[k]=a[i];
                a[i]=temp;
                i++;
                k++;
            }

            else if(a[k]>y)
            {
                int temp=a[k];
                a[k]=a[j];
                a[j]=temp;
                j--;
            }
            else 
            k++;
        }
    }

    static void print(int a[],int n)
    {
        System.out.println("\nModified Array will be...");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]={76,8,75,22,59,96,30,38,36};
        int n=a.length;
        int x=44;
        int y=62;
        ParttioningArray(a,n,x,y);
        print(a,n);
    }
}