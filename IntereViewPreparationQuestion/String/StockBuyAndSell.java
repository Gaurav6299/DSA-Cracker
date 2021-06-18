class StockBuyAndSell
{
    static int buyAndSell(int a[])
    {
        int maxPro=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]>a[i])
            {
              maxPro+=a[i+1]-a[i];
            }
        }
        return maxPro;
    }
   public static void main(String args[])
   {
       int a[]={100,180,260,310,40,535,695};
       System.out.println("MaxProd:"+buyAndSell(a));
   }
}