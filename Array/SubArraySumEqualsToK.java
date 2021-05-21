// Count the number of SubArray whose sum equals to given k.

import java.util.*;
class SubarraySumEqualsToK
{
    static int SubArraySum(int a[],int k)
    {
        int sum=0;
        int count=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            s.add(sum);
            sum+=a[i];
            if(s.contains(sum-k))
            {
                count++;
            }
        }

        return count;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,-1,6};
        int k=6;
        System.out.println("SubArray Sum Equals to K:"+SubArraySum(a,k));
    }
}