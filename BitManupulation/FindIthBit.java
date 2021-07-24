class FindIthBit
{
    static int findBit(int n,int i)
    {
        int lastBit=n&1;
        // System.out.println(lastBit);
        int mask=lastBit<<i;
        // System.out.println(mask);
        // System.out.println(n & mask);
        if((n & mask)==0)
        return 0;
        else
        return 1;
      
    }
    public static void main(String args[])
    {
        int n=100110101;
        int i=6;
        System.out.println("Ith bit is:"+findBit(n,i));
    }
}