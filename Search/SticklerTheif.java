// Maximum sum such that no two elements are adjacent...
class SticklerTheif
{
    static int maxAdjacentSum(int a[])
    {
        int n=a.length;
        int in=a[0];
        int ex=0;
        for(int i=1;i<n;i++)
        {
            int new_in=ex+a[i];
            int new_ex=Math.max(in,ex);
            in=new_in;
            ex=new_ex;
        }
        int ans=Math.max(in,ex);
        return ans;
    }
    public static void main(String args[])
    {
        int a[]={5,5,10,100,10,5};
        System.out.println("Max adjacent sum is:"+maxAdjacentSum(a));
    }
  
}