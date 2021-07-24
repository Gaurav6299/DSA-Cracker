class SwapTwo
{
    static void swap(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[])
    {
        int a=10;
        int b=5;
        swap(a,b);
    }
}