// Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, you have to output the number of integers less than N in the sample space S.

 class CountSquares
 {
     static int count(int n)
     {
         int count=0;
         for(int i=1;i<n;i++)
         {
           if(i*i<n)
           count++;
         }
         return count;
     }
     public static void main(String args[])
     {
         int n=9;
         System.out.println("Count="+count(n));
     }
 }