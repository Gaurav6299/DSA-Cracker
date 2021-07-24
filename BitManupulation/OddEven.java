// Find the odd and even number using Bitwise operator
class OddEven
{
    static String findOddEven(int n)
    {
        if((n&1)==0)
        return "even";

        else
        return "odd";
    }
    public static void main(String arg[])
    {
        int n=57;
        System.out.println("What is it? " +findOddEven(n));
    }
}