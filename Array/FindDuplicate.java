// Find the Duplicate numbers inside the array without using any space means constant extra space


import java.util.*;
class FindDuplicate
{
    static void duplicate(int a[])
    {
        int k=0;
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                k=a[i];
                System.out.println(k);
            }
        }
        
    }
    public static void  main(String args[])
    {
        int a[]={1,3,4,2,2};
        duplicate(a);
    }
}