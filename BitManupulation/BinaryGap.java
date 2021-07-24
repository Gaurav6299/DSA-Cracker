/*
Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.
*/
// T(c)=o(n)
// Space=o(1)
public class BinaryGap {
    static int longestDistance(int n)
    {
        StringBuilder sb=new StringBuilder();
        while(n!=0)
        {
            int r=n%2;
            sb.append(r);
            n=n/2;
        }

        int j=-1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='1')
            {
                if(j==-1)
                j=i;

             ans=Math.max(ans, i-j);
             j=i;
            }

        }
        return ans;
    }
     public static void main(String[] args) {
         int n=22;
         System.out.println(longestDistance(n));
     }    
}
