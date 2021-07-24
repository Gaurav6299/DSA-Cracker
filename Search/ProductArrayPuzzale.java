// Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].
import java.util.*;
class ProductArrayPuzzale {
    static int[] findProduct(int a[])
    {
        int n=a.length;
        int prod[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=1;
        right[n-1]=1;

        for(int i=1;i<n;i++)
        {
            left[i]=a[i-1]*left[i-1];
        }

        for(int j=n-2;j>=0;j--)
        {
            right[j]=right[j+1]*a[j+1];
        }

        for(int i=0;i<n;i++)
        {
            prod[i]=left[i]*right[i];
        }
        return prod;
    }
    public static  void main(String[] args) {
        int a[]={10,3,5,6,2};
           System.out.println("Product is:"+Arrays.toString(findProduct(a)));
    }
        
}
