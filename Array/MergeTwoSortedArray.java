//Merge two Sorted Array without using any extra space..after merge that should also in sorted order
import java.util.*;
class MergeTwoSortedArray
{
    static void mergeArray(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;
        int i=n-1;
        int j=0;
        while(i>=0 && j<m)
        {
            if(a[i]>b[j])
            {
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }else
            break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int k:a){
            System.out.print(k+" ");
        }
        for(int l:b){
            System.out.print(l+" ");
        }
    }
       public static void main(String args[])
       {
           int a[]={10,12};
           int b[]={5,18,20};
           mergeArray(a,b);
       }
}