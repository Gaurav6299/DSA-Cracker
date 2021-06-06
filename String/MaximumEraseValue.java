/*
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.
*/
// T(c)=o(n)
// Space=o(n)
import java.util.*;
class MaximumEraseValue
{
    static int eraseSubArray(int a[])
    {
        Set<Integer> s=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        int sum=0;

        if(a.length==0)
        return 0;
        while(j<a.length)
        {
            int x=a[j];
            if(s.add(x))
            {
                sum+=x;
                max=Math.max(max,sum);
                j++;
            }
            else{
                while(a[i]!=x)
                {
                    s.remove(a[i]);
                    i++;
                }
                s.remove(x);
                sum=sum-x;
                i++;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int a[]={4,2,4,5,6};
        System.out.println("Maximum Score is:"+eraseSubArray(a));
    }
}