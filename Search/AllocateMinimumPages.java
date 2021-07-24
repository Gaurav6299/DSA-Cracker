import java.util.Arrays;

public class AllocateMinimumPages {

// =========Method-1==========
// T(c)=o(n^2)
    static int findMinPage(int n,int a[],int m)
    {
    //     int temp[]=new int[n];
    //     int k=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         int sum=0;
    //         k=k+a[i];
    //         for(int j=i+1;j<n;j++)
    //         {
    //           sum+=a[j];
    //         }

    //         temp[i]=Math.max(k,sum);
    //     }
    //     System.out.println(Arrays.toString(temp));

    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<temp.length;i++)
    //     {
    //        if(temp[i]<min)
    //        {
    //            min=temp[i];
    //        }
    //     }
    //     return min;

    int i=0;
    int j=a.length-1;
    int min=0;
    while(i<j)
    {
        int sum=0;
        int mid=(i+j)/2;
        for(int k=0;k<=mid;k++)
        {
            sum+=a[k];
        }
        min=Math.max(min,sum);
        i++;

    }
    return min;

    }
    public static void main(String[] args) {
        int n=4;
        int a[]={12,34,67,90};
        int m=2;
        System.out.println(findMinPage(n,a,m));
    }
    
}
