// Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
// Return the sorted array.

import java.util.*;
public class SortIntegersNumberOf1Bits {
    class MakePair{
        int val;
        int count;
        MakePair(int val,int count)
        {
            this.val=val;
            this.count=count;
        }

    }

    static int countBits(int k)
    {
        int count=0;
        while(k!=0)
        {
            count++;
            k=k&(k-1);
        }
        return count;
    } 

    static void print(int b[])
    {
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={0,1,2,3,4,5,6,7,8};
        List<MakePair> l=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            l.add(new SortIntegersNumberOf1Bits().new MakePair(a[i],countBits(a[i])));
        }
        Collections.sort(l,(x,y)->x.count==y.count? x.val-y.val:x.count-y.count);
        int i=0;
        int b[]=new int[a.length];
        for(MakePair p:l)
        {
            b[i++]=p.val;
        }
        print(b);
    }
}
