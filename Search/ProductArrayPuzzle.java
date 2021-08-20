// T(c)=o(n2)
// space=o(n)
import java.util.*;
class ProductArrayPuzzle
{
    static long[] product(int a[])
    {
        // int n=a.length;
        // int prod[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //    int p=1;
        //    for(int j=0;j<n;j++)
        //    {
        //        if(i!=j)
        //        {
        //            p=p*a[j];
        //        }
        //    }
        //    prod[i]=p;

        // }
        // return prod;
     

    // Method 2
    // T(c)=o(n)
    // Space=o(n)
//      int n=a.length;
//      long left[]=new long[n];
//      long right[]=new long[n];
//     long prod[]=new long[n];
//      left[0]=1;
//      right[n-1]=1;
//      for(int i=1;i<n;i++)
//      {
//          left[i]=a[i-1]*left[i-1];
//      }

//      for(int i=n-2;i>=0;i--)
//      {
//          right[i]=a[i+1]*right[i+1];
//      }
//      for(int i=0;i<n;i++)
//      {
//          prod[i]=left[i]*right[i];
//      }

// return prod;

// Efficient Method
// T(c)=o(n)
// If you are multiplying integer with long value and the value is bigger so it will stored the value in negative.
  int n=a.length;
  long prod[]=new long[n];
  long temp=1;
  for(int i=0;i<n;i++)
  {
      prod[i]=temp;
      temp=temp*a[i];
  }

  temp=1;
  for(int i=n-1;i>=0;i--)
  {
      prod[i]=prod[i]*temp;
      temp=temp*a[i];
  }

  return prod;
    }
  public static void main(String args[])
  {
      int a[]={10,3,5,6,2};
    // int a[]={12,0};
    // int a[]={7, 8, 6, 4, 6, 7, 3, 10, 2, 3, 8, 1, 10, 4, 7, 1, 7, 3, 7, 2, 9, 8, 10, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1};
    long b[]=product(a);
    for(int i=0;i<b.length;i++)
    {
        System.out.print(b[i]+" ");
    }
      
  }
}