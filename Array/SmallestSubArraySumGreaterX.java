// Find the minimum length of the Subarray whose sum is greater then X.
class SmallestSubArraySumGreaterX
{
    static int SubArraySumGreaterThenX(int a[],int x)
    {
        //==========Method 1 T(c)=o(n^2)==========

        // int n=a.length;
        // int minLen=0;
        // for(int i=0;i<n;i++)
        // {
        //     int count=0;
        //     int sum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //        sum+=a[j];
        //        count++;
        //        if(sum>x)
        //        {
        //            if(minLen==0)
        //            {
        //                minLen=count;
        //            }

        //            minLen=Math.min(minLen,count);
        //        }
        //     }
        // }
        // return minLen;


// ================Method 2=========T(c)=o(n)
       int sum=0
       int min=0;
       int count=0;
       int l=0;
       for(int i=0;i<n;i++)
       {
           sum+=a[i];
           count++;
           while(sum>x && l<=i)
           {
               sum-=a[l];
               if(min==0)
               min=count;
               min=Math.min(min,count);
               c--;
               l++;

           }
       }

       return min;

    }
public static void main(String arg[])
{
    int a[]={1,4,45, 6,0,19};
    int x=51;
    int k=SubArraySumGreaterThenX(a,x);
    System.out.println("Minimum Length="+k);
}
}