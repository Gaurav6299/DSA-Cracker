// Count the total number of setbits from 1 to n.
class CountTotalSetBits
{
    static int counBits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int x=highestPow(n);
        int beforePowOf2=x*(1<<(x-1));
        int afterPow=n-(1<<x)+1;
        int res=n-(1<<x);
        int ans=beforePowOf2+afterPow+counBits(res);
        return ans;
    }

    static int highestPow(int n)
    {
        // Find the highest power of 2 which is less than equals to n.
        int x=0;
        while((1<<x)<=n)
        {
            x++;
        }
        return x-1;
    }
    public static void main(String args[])
    {
        int n=10;
        System.out.println("Set bits is:"+counBits(n));
    }
}