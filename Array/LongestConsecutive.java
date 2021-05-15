// Find the length of the longest consecutive subsequence..
//Here i have solve this question in o(nlogn) time complexity.. and space is o(n).

import java.util.*;
class LongestConsecutive
{
    static int longestSubsequence(int a[],int n)
    {

   /*=======Method 1 solution================

        int c=1;
        int max=1;
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(!l.contains(a[i]))
            {
            l.add(a[i]);
            }
        }
       
        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i+1)-l.get(i)==1)
            {
                c++;
            }
            else{
                c=1;
            }

            max=Math.max(c,max);
        }

        return max; */

//========Efficient solution Method 2 ===================
//the time time complexity will be this T(c)=o(n).. and space is o(n)
Set<Integer> s=new HashSet<>();
int max=0;
for(int i:a)
{
    s.add(i);
} 

for(int i=0;i<n;i++)
{
    int c=0;
    if(!s.contains(a[i]-1))
    {
         int j=a[i];
         while(s.contains(j))
         {
            j++;
            c++;
         }

         max=Math.max(c,max);
    }
    
}
       
return max;
}
    public static void main(String args[])
    {
        int a[]={1,2,9,3,10,4,20};
        int n=a.length;
        System.out.println("Longest Consecutive SubSequence="+longestSubsequence(a,n));
    }
}