class SubsetSumSpoj
{
    static int findSubset(int ar[],int a,int b)
    {
        int count=0;
        int sum=0;

        for(int i=0;i<ar.length;i++)
        {
            sum=0;
            for(int j=i;j<ar.length;j++)
            {
                sum+=ar[j];
                if(sum<=a|| sum<=b)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int ar[]={1,5,3,4,2,6};
        int a=6;
        int b=10;
        System.out.println("Sum is:"+findSubset(ar,a,b));

    }
}