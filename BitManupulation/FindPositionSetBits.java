// Find the position of the set bits.If the binary representation of a given number  has more than one bits then the answer would be -1.
// T(c)=o(no of setBits) or o(1)
// space=o(1)
class FindPositionSetBits
{
    static int findSetBitsPos(int n)
    {
        int count=0;
        int temp=n;
        while(temp!=0)
        {
          count++;
          temp=temp&(temp-1);
        }

        int k=0;
        if(count==1)
        {
          while(n!=0)
          {
             int y=n&1;
             if(y==1)
             {
                 k++;
                 return k;
             }
             else{
                 n=n>>1;
                 k++;
             }
          }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int n=4;
        System.out.println("Position of setBits is:"+findSetBitsPos(n));
    }
}