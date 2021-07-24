// Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.

// T(c)=o(n)
// space=o(1)
class BitwiseAndInTheRange
{
    static int bitwiseAnd(int m,int n)
    {
        int count=0;
        while(m!=n)
        {
            m=m>>1;
            n=n>>1;
            count++;
        }
        return m<<count;
    }
    public static void main(String[] args) {
        int m=5;
        int n=7;
        System.out.println(bitwiseAnd(m,n));
    }
}