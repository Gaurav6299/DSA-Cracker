// Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
// Majority Element
// T(c)=1
// Space=o(n)
import java.util.*;
class MajorityElement
{
    static int majority(int a[])
    {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        for(int k:m.keySet())
        {
            if(m.get(k)>a.length/2)
            return k;
        }
        return -1;
    }
    public static void main(String args[])
    {
    int a[]={3,2,3,3,1};
    System.out.println("Element is:"+majority(a));
    }
}