// Find the sum m of two numbers without using + and - operator.
class SumOfTwoNumbers
{
    static int sum(int a,int b)
    {
        int xor=a^b;
        int carry=a&b;
        if(carry==0)
        return xor;
        else
        return sum(xor,carry<<1);
    }
 public static void main(String[] args) {
     int a=5;
     int b=7;
     System.out.print(sum(a,b));
 }
}