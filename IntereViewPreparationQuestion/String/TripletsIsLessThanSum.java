class TripletsIsLessThanSum
{
    static int countTripletsLessThanSum(int a[],int sum)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            int j=i+1;
            int k=a.length-1;
            // int x=0;
            while(j<k)
            {
                if(a[i]+a[j]+a[k]>=sum)
                {
                    k--;
                }
                else
                {
                      count+=k-j;
                      j++;
                }
            }
        }
        return count;
    }
  public static void main(String args[])
  {
      int a[]={5,1,3,4,7};
      int sum=12;
      System.out.println("Triplets is:"+countTripletsLessThanSum(a,sum));
  }
}