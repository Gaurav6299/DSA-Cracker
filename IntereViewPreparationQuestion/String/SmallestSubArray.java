class SmallestSubArray
{
    static int subArray(int a[],int x)
    {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int count=0;
        int l=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            count++;
            while(sum>x && l<=i)
            {
                sum=sum-a[l];
                min=Math.min(min,count);
                count--;
                l++;
            }
        }

        return min;
    }
    public static void main(String args[])
    {
        int a[]={1,4,45,6,0,19};
        int x=51;
        System.out.println("Min length:"+subArray(a,x));
    }
}