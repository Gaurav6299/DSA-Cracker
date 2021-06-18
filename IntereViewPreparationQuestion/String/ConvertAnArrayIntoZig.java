// Convert an array into Zig Zag fashion(a<b>c<d>e<f)
import java.util.*;
class ConvertAnArrayIntoZig
{
    static void convertZigZag(int a[])
    {
        // T(c)=o(n)
        // space=o(1)
        // Efficient approach
        // int i=0;
        // boolean f=true;
        // while(i<a.length-1)
        // {
        //     if(f)
        //     {
        //         if(a[i]>a[i+1])
        //         {
        //             int temp=a[i];
        //             a[i]=a[i+1];
        //             a[i+1]=temp;
        //         }
        //     }
        //     else
        //     {
        //         if(a[i]<a[i+1])
        //         {
        //             int temp=a[i];
        //             a[i]=a[i+1];
        //             a[i+1]=temp;

        //         }

        //     }

        //       i++;

        //     f=!f;
        // }

        //===============Second Method===============
        // T(c)=o(nlogn)
        // Space=o(1)
        Arrays.sort(a);
        for(int i=1;i<a.length-1;i+=2)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        
    }
    public static void main(String args[])
    {
       int a[]={4,3,7,8,6,2,1};
        //   int a[]={1,4,3,2};
       convertZigZag(a);
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
    }
}