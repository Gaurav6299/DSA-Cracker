// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

import java.util.*;
class ChocolateDistribution
{
    static int chocolateDistribute(ArrayList<Long> a,long n,long m)
    {
        Collections.sort(a);
        int y=(int)n;
        int k=(int)m;
        int min=Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++)
        {
            long d=a.get(i+k-1)-a.get(i);
            int h=(int)d;
            min=Math.min(min,h);

        }

        return min;
    }
    public static void main(String args[])
    {
        ArrayList<Long> l=new ArrayList<>();
        l.add((long)3);
        l.add((long)4);
        l.add((long)1);
        l.add((long)9);
        l.add((long)56);
        l.add((long)7);
        l.add((long)9);
        l.add((long)12);
        long n=l.size();
        long m=5; //here m represent the number of student
        int u=chocolateDistribute(l,n,m);
        System.out.println("The difference between maximum number of chocolate and minimum number of chocolate is:"+u);
    }
}