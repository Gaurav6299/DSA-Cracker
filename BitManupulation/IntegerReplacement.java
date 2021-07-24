/*
 Given a positive integer n, you can apply one of the following operations:
If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n - 1.
Return the minimum number of operations needed for n to become 1.

*/
class IntegerReplacement {
    static int integerReplace(int n)
    {
        if(n==1)
        return 0;

        if(n==Integer.MAX_VALUE)
        return 32;

        else if(n%2==0)
        return 1+integerReplace(n/2);

        else
        return 1+Math.min(integerReplace(n+1),integerReplace(n-1));
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(integerReplace(n));
    }
    
}