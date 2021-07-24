// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

// T(c)=o(n)
// space=o(1)
import java.util.*;
public class CountingBits {
    static int[] countBits(int n)
    {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int count=0;
            int k=i;
            while(k!=0)
            {
                int x=k&1;
                if(x!=0)
                count++;

                k=k>>1;
            }
            ans[i]=count;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int n=7;
        System.out.println("Number bits is:"+Arrays.toString(countBits(n)));
    }
    
}
