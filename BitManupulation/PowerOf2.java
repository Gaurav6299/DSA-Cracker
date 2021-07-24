// Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.
// Note:-Only those number power is exist, whose set bit is one.
// T(c)=o(no of setbits) or o(1)
// space=o(1)
class PowerOf2
{
    static boolean checkPower(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n&(n-1);
        }
        if(count==1)
        return true;
        else
        return false;
    }
    public static void main(String arg[])
    {
        int n=10;
        System.out.println("is it power of 2:"+checkPower(n));
    }
}