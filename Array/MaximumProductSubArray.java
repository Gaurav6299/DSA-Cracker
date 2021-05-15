// Find the maximum product SubArray Sum
class MaximumProductSubArray
{
    static int maxProduct(int a[])
    {
        int n=a.length;
        int max=a[0];
        int min=a[0];
        int res=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<0)
            {
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(a[i],a[i]*max);
            min=Math.min(a[i],a[i]*min);
            res=Math.max(res,max);
        }
        return res;
    }
    public static void main(String args[])
    {
        int a[]={6,-3,-10,0,2};
        System.out.println("Maximum Product="+maxProduct(a));
    }
}