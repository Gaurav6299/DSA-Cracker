// Reverse the bits in 32 bit binary representation and give the output in decimal.
class ReverseBit
{
    static long reverse(long n)
    {
        long b=0;
        for(int i=0;i<32;i++)
        {
            b=b<<1;
            b|=n&1;   //we want decimal value so thats why we are performing or operation over here.
            n=n>>1;


        }

        return b;
    }
    public static void main(String args[])
    {
        long n=000000000011;
        System.out.println("Reverse bit is:"+reverse(n));
    }
}