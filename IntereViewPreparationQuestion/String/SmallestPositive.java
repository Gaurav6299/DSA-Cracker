class SmallestPositive
{
    static int smallestInteger(int a[])
    {
        int sum=0;
        int t=1;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(a[i]>t)
            {
                return t;
            }
            else if(a[i]<=t)
            t=sum+1;

        }
        return t;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3};
        System.out.println("Smmalest value is:"+smallestInteger(a));
    }
}