//Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
//That means traders buy and sell multiple times..
class MaximumProfitBuyingAtMostTwice
{
    static int buyingAtMostTwice(int a[],int n)
    {
        int maxProfit=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            {
                maxProfit+=a[i]-a[i-1];
            }
        }

        return maxProfit;
    }
    public static void main(String args[])
    {
        int a[]={2, 30, 15, 10, 8, 25, 80};
        int n=a.length;
        System.out.println("Maximum profit is buying at most twice :"+buyingAtMostTwice(a,n));
    }
}