// Count the number of primes less then  n.
import java.util.*;
public class CountPrimes {
    static int primes(int n)
    {
        boolean prime[]=new boolean[n];
        int count=0;
        Arrays.fill(prime,true);
        int square=(int)Math.sqrt(n);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=square;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                   prime[j]=false;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            if(prime[i]==true)
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int n=10;
        n=40000;
        System.out.println(primes(n));
    }
    
}
