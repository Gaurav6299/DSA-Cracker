// Given an array of size n and an integer k, find all elements that appears more than n/k times.
import java.util.*;
class AppearMoreThan
{
    static void appearMoreThanNByK(int a[],int k)
    {
        int n=a.length;
        HashMap<Integer,Integer>m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }

        for(int i:m.keySet())
        {
            if(m.get(i)>n/k)
            { 
               l.add(i);  
            }
        }
        System.out.println(l);
    }
    public static void main(String args[])
    {
        int a[]={3, 1, 2, 2, 1, 2, 3, 3} ;
        int k=4;
        appearMoreThanNByK(a,k);
    }
}