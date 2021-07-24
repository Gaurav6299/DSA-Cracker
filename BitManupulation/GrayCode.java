/*

An n-bit gray code sequence is a sequence of 2n integers where:

Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.

Note:- Gray code means only one bit is different in each bit pair.
*/

import java.util.*;
class GrayCode
{
    static List<Integer> findGrayCode(int n)
    {
        List<Integer> l1=new ArrayList<>();
        l1.add(0);

        for(int i=0;i<n;i++)
        {
            int msb=1<<i;
            for(int j=l1.size()-1;j>=0;j--)
            {
                int x=l1.get(j)|msb;
                l1.add(x);
            }
        }
        return l1;

    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(findGrayCode(n));
    }
}