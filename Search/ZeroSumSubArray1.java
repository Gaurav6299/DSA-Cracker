// You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.
import java.util.*;
class ZeroSumSubArray1
{
    static int  zeroSum(int a[])
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(m.containsKey(sum))
            {
                count+=m.get(sum);
                m.put(sum,m.get(sum)+1);
            }
            else{
                m.put(sum,m.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int a[]={0,0,5,5,0,0};
        System.out.println("All Subarray whose sum equals to zero:"+zeroSum(a));
    }
}