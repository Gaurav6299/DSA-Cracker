// Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.
// Or count the  number between the range that will hold the prime number of Setbits..
/*
Input: left = 6, right = 10
Output: 4
Explanation:
6 -> 110 (2 set bits, 2 is prime)
7 -> 111 (3 set bits, 3 is prime)
9 -> 1001 (2 set bits , 2 is prime)
10->1010 (2 set bits , 2 is prime)
*/
public class PrimeNumberOfSetBits {
    static int findPrimeSetBits(int x,int y)
    {
        int ans=0;
        for(int i=x;i<=y;i++)
        {
            int count=0;
            int k=i;
            while(k!=0)
            {
                count++;
                k=k&(k-1);
            }
            if(isPrime(count) && count!=1)
            {
                ans++;
            }

        }
        return ans;
    }

    static boolean isPrime(int count)
    {
        for(int i=2;i<count;i++)
        {
            if(count%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x=10;
        int y=15;
        System.out.println("Number of primeSetBits="+findPrimeSetBits(x,y));

    }
    
}
