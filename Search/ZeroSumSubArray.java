class ZeroSumSubArray
{
    static int zeroSum(int a[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
               sum+=a[j];
               if(sum==0)
               count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int a[]={6,-1,-3,4,-2,2,4,6,-12,-7};
        int n=a.length;
        System.out.println("Sum is:"+zeroSum(a,n));
    }
}