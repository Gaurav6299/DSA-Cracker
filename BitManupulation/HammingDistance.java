// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
// Given two integers x and y, return the Hamming distance between them in 32 bit format.
// Or count the number of positions at which the corresponding bits are different.
// T(c)=o(n)
// space=o(1)
class HammingDistance
{
    static int findNumberOfPos(int x,int y)
    {
        int count=0;
        for(int i=0;i<32;i++)
        {
            int a=x>>i;
            int b=y>>i;
            if((a&1)!=(b&1))
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int x=1;
        int y=4;
        System.out.println("Hamming Distance is:"+findNumberOfPos(x,y));
    }
}