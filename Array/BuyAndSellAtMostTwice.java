// Find the maximum profit if the traderrs buy and sell the stock at most two times in a day...
// condition:-- After finishing of first transaction than second transaction will start(means first buy then sell before sell the first stock you cant buy the second one)
class BuyAndSellAtMostTwice
{
    static int buyAtMostTwice(int a[],int n)
    {
        int profit[]=new int[n];
        for(int i=0;i<n;i++)
        {
            profit[i]=0;
        }

        int max_selling=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>max_selling)
            {
                max_selling=a[i];
            }
            profit[i]=Math.max(max_selling-a[i],profit[i+1]);
        }

        int min_price=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min_price)
            {
                min_price=a[i];
            }
            profit[i]=Math.max(profit[i]+(a[i]-min_price),profit[i-1]);
        }

        int res=profit[n-1];
        return res;
    }
    public static void main(String args[])
    {
        int a[]={3,3,5,0,0,1,4};
        int n=a.length;
        System.out.println("Buy and sell Atmost two times:"+buyAtMostTwice(a,n));
    }
}