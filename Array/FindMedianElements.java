//Find the median(elements) of the array...
//Process:- If the length of array is odd so mid index represent  the  median of the elements.
// If the length is even so there is two mid..so the average of two mid elements is the median of the elements.
import java.util.*;
class FindMedianElements
{
     static int findMedian(int a[],int n)
        {
            Arrays.sort(a);
            int i=0;
            int j=n-1;
            int mid=(i+j)/2;
            if(n%2==0)
            {
                int median=(a[mid]+a[mid+1])/2;
                return median;
            }
            return a[mid];
        }
    public static void main(String args[])
    {
        int a[]={90,100,78,89,67};
        int n=a.length;
       System.out.println("Median elements is:"+findMedian(a,n));
    }
}