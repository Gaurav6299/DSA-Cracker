// Fimd the KthSmallestElement in a matrix where the matrix is a row-column wise sorted matrix
// T(c)=o(n^2*log(n))
// space=o(n^2)
import java.util.*;
class KthSmallestElementMatrix
{
    static int findKthSmallestElement(int a[][],int k,int n)
    {
        //========= Method=1=============
        // ArrayList<Integer> l=new ArrayList<>();
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         l.add(a[i][j]);
        //     }
        // }
        // Collections.sort(l);
        // int i=0;
        // while(i<k-1)
        // {
        //     i++;

        // }

// return l.get(i);


// Efficient Method
// T(c)=o(n*log(n))
// Space=o(1)

    int low=a[0][0];
    int high=a[n-1][n-1];
    while(low<high)
    {
        int mid=low+(high-low)/2;
        int count=findCount(a,mid,n);
        if(count>=k)
        {
            high=mid;
        }
        else
        {
            low=mid+1;
        }
    }
    return low;

    }

    static int findCount(int a[][],int mid,int n)
    {
        int count=0;
       for(int i=0;i<n;i++)
       {
           for(int j=n-1;j>=0;j--)
           {
               if(a[i][j]<=mid)
               {
                   count+=j+1;
                   break;
               }
           }
       }
       return count;
    }
    public static void main(String args[])
    {
        int a[][]={{16,28,60,64},{22,41,63,91},{27,50,87,93},{36,78,87,94}};
        int k=3;   //Kth smallest Element
        int n=4;
        System.out.println("Kth Smallest elemnt is:"+findKthSmallestElement(a,k,n));
    }
}