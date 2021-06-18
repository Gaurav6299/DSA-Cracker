import java.util.*;
class LongestSubArraySequence
{
    static int findLongest(int a[])
    {
       Set<Integer> s=new HashSet<>();
       for(int i:a)
       {
           s.add(i);
       }

      int max=Integer.MIN_VALUE;
    //   int count=0;
       for(int i=0;i<a.length;i++)
       {
           int count=0;
           if(!s.contains(a[i]-1))
           {
               int j=a[i];
               while(s.contains(j))
               {
                   j++;
                   count++;
               }

             max=Math.max(count,max);
           }
       }
       return max;
    }
   public static void main(String args[])
   {
       int a[]={1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
       System.out.println("Longest Subarray:"+findLongest(a));
   }
}