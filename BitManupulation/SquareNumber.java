// Given an integer n, calculate the square of a number without using *, / and pow(). 
// T(c)=o(n)
class SquareNumber
{
    static int findSquare(int n)
    {
        // ========Mathod-1=======
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=n;
        // }
        // return sum;


//==========Method-II===========
        if(n==0)
        return 0;

        if(n<0)
        n=-n;

        int x=n>>1;      //here n>>1 means divide the number by 2.
        if(n%2!=0)
        return((findSquare(x)<<2)+(x<<2)+1);
        else
        return (findSquare(x)<<2);


    }
    public static void main(String arg[])
    {
        int n=5;
        System.out.println("Sum="+findSquare(n));
    }
}