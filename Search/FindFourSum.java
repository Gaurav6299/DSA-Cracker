// Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.
import java.util.*;
class FindFourSum
{
    static ArrayList<ArrayList<Integer>> findSum(int a[],int y)
    {
        ArrayList<ArrayList<Integer>> l2=new ArrayList<ArrayList<Integer>>();
       
        int n=a.length;
        for(int i=0;i<n-3;i++)
        {
         for(int j=i+1;j<n-2;j++)
         {
             int k=j+1;
             int l=n-1;
             while(k<l)
             {
                 ArrayList<Integer> l1=new ArrayList<>();
                 if(a[i]+a[j]+a[k]+a[l]==y)
                 {
                     l1.add(a[i]);
                     l1.add(a[j]);
                     l1.add(a[k]);
                     l1.add(a[l]);
                    l2.add(l1);

                    // Preprocessing the duplicate of number 3
                    while(k<l && a[k]==l1.get(2)) k++;
                
                // Preprocessing the duplicate of number  4
                    while(k<l && a[l]==l1.get(3)) l--;
                 }
                 else if(a[i]+a[j]+a[k]+a[l]<y)
                 {
                     k++;
                 }
                 else
                 l--;
             }
             // Preprocessing the duplicate of number 2
             while(j+1<n && a[j]==a[j+1]) j++;
         }   
       // Preprocessing the duplicate of number 1
         while(i+1<n && a[i]==a[i+1]) i++;
    }
        
    return l2;
           
    }
    public static void main(String args[])
    {
        int a[]={10,2,3,4,5,7,8};
        // int a[]={0,0,2,1,1};
        int k=23;
        System.out.println("Sum is:"+findSum(a,k));
    }
}