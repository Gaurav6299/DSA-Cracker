//Find the Kth Smallest Element in an array
//First we need to sort the array
//a[]={5,7,10,11,12,32,77}, so here 1th smallest element is 5 2th smallest is 7 and 3th smallest is 10and so on....
import java.util.*;
class KthSmallestElement
{
    static int  kthSmallest(int a[],int k)
    {
        Arrays.sort(a);
        if(k>a.length){
            return -1;
        }
        int i=0;
        while(i<k-1){
            i++;
        }
        return a[i];
    }
    public static void main(String args[])
    {
        int a[]={7,5,10,12,77,32,11};
        int k=5;
        int x=kthSmallest(a,k);
        System.out.println("Kth smallest Element is:"+x);
    }
}