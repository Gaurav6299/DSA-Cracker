// Find the sum of All XOR totals for every subset...
class SumOfAllXOR
{
  static int sumOfAllXor(int a[],int n)
  {
      int sum=0;
      for(int i=0;i<Math.pow(2,n);i++)
      {
          int b=i;
          int x=0;
          int t=0;
          while((b|0)!=0)
          {
              if((b&1)==1)
              t=t^a[x];

              x++;
              b=b>>1;
          }
          sum+=t;
      }
      return sum;
  }
    public static void main(String args[])
    {
        int a[]={1,3,2};
        int n=a.length;
        System.out.println("All Xor Sum="+sumOfAllXor(a,n));
    }
}