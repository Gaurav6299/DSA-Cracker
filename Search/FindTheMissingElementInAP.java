// Given an array that represents elements of arithmetic progression in order. One element is missing in the progression, find the missing number. 
// T(c)=o(logn)
// space=o(1)
// Efficient Approach
class FindTheMissingElementInAP
{
    // static int findMissing(int a[],int low,int high,int diff)
    // {
    //     if(high<=low)
    //     return Integer.MAX_VALUE;

    //     int mid=(low+high)/2;
    //     if(a[mid+1]-a[mid]!=diff)
    //     return a[mid]+diff;

    //     if(mid>0 && a[mid]-a[mid-1]!=diff)
    //     return a[mid-1]+diff;

    //     if(a[mid]==a[0]+mid*diff)   //if mid==n/2th element i.e suppose mid is 4,then 4==9/2 then we will search in the right half
    //                                    //otherwise in the left half. 
    //     return findMissing(a,mid+1,high,diff);

    //     else
    //     return findMissing(a,low,mid-1,diff);
    // }
    // static int findDifference(int a[])
    // {
    //     int n=a.length;
    //     int diff=(a[n-1]-a[0])/n;
    //     return findMissing(a,0,n-1,diff);
    // // }
    // public static void main(String args[])
    // {
    //     int a[]={2,4,8,10,12,14};
    //     System.out.println("Missing element is:"+findDifference(a));
    // }

//=================Mathod -2=============

// T(c)=0(n)
// space=0(n)
static int findMissing(int a[])
{
    int n=a.length;
    int b[]=new int[n+1];
    int x=a[0];
    int diff=(a[n-1]-a[0])/n;
    for(int i=0;i<b.length;i++)
    {
        b[i]=x;
        x+=diff;
    }

    int i=0;
    int j=0;
    while(i<a.length && j<b.length)
    {
        if(b[j]!=a[i])
        return b[j];
        else
        {
            i++;
            j++;
        }
    }
    return -1;
}
public static void main(String args[])
{
    // int a[]={2,4,8,10,12,14};
    int a[]={1, 6, 11, 16, 21, 31};
    System.out.println("Missing Element is:"+findMissing(a));
}


}