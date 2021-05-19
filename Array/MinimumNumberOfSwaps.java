//Given an array a[] your task is find the minimum number of swaps  required to  bring all the numbers less than or equals to k
//together.
class MinimumNumberOfSwaps
{
    static int minimumSwaps(int a[],int k)
    {
        int count=0;
        int bad=0;  // here i will take bad which is greater than k
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=k)
            count++;
        }

        for(int i=0;i<count;i++)
        {
            if(a[i]>k)
            bad++;
        }

        int min=bad;
        int i=0;
        int j=a.length-1;
        while(j<a.length)
        {
            if(a[i]>k)
            bad--;

            if(a[j]>k)
            bad++;

            min=Math.min(min,bad);
            i++;
            j++;

        }

        return min;
    }
    public static void main(String args[])
    {
        int a[]={2,1,5,6,3};
        int k=3;
        System.out.println("Minimum number of swaps is:"+minimumSwaps(a,k));
    }
}