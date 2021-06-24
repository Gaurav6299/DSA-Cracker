// Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).
// Or Find the middle element of the three element
// T(c)=o(1)
class MiddleElement
{
    static int findMiddle(int a,int b,int c)
    {
        if((a>b && a<c)||(a>c && a<b))
        return a;

        else if((b>c && b<a) || (b>a && b<c))
        return b;
        else
        return c;
    }
    public static void main(String args[])
    {
        int a=162,b=934,c=200;
        System.out.println("Middle Element is:"+findMiddle(a,b,c));
    }

}
