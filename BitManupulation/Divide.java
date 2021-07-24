// Divide the two number a and b.
// T(c)=o(a)..or o(number of dividend)
class Divide
{
    static int divideNum(int a,int b)
    {
        int sign=((a<0)^(b<0))?-1:1;
        a=Math.abs(a);
        b=Math.abs(b);
        int count=0;
        while(a>=b)
        {
            a=a-b;
            count++;               //Number of count is called the quotient(division) or dividend it becomes the remainder.
        }
        return count*sign;

    }
    public static void main(String arg[])
    {
        int a=10;
        int b=-3;
        System.out.println("Division is:"+divideNum(a,b));
    }
}