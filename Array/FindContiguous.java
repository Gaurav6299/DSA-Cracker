//find the Contiguous sub-array with maximum sum
class FindContiguous
{
    static int subArraySum(int a[])
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum>max)
            max=sum;
            if(sum<0)
            sum=0;
        }
        return max;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,-2,5};
        System.out.println("Sub Array sum is:"+subArraySum(a));
    }
}