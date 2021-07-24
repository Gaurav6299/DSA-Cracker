// Find the number of 1 bit in the given binary representation
//  or find the number of set bit(1).
// T(c)=0(number of set bit)
// Method-1 and efficient
class NumberOf1Bit
{
    static int findNumberOf1(int n)
    {
        // int count=0;
        // while(n!=0)
        // {
        //     count++;
        //     n=n&(n-1);
        // }
        // return count;

        // Second Method
        int count=0;
        while(n!=0)
        {
            int res=n&1;
            if(res!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        int n=0000000000000011001;
        System.out.println("1 Bit is:"+findNumberOf1(n));
    }
}