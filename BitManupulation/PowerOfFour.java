// Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4x.
// T(c)=o(n)
// space=0(1)
class PowerOfFour{
    static boolean power(int n)
    {
        int count=0;
        for(int i=0;i<32;i++)
        {
            int k=n>>i;
            if((k&1)!=0)
            {
                count++;
                if(i%2==1)return false;
            }
        }
        if(count==1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(power(n));
    }
}