// Find the rows that contains a maximum number of 1's..if such rows exist then return that row otherwise return -1.
// T(c)=o(r*c)
// space=o(1)
import java.util.*;
class Maximum1InRows
{
    static int max1s(int a[][])
    {
     //=============Method=1============

        // int r=a.length;
        // int c=a[0].length;
        // int max=0;
        // int row=-1;
        // for(int i=0;i<r;i++)
        // {
        //     int count=0;
        //     for(int j=0;j<c;j++)
        //     {
        //          if(a[i][j]==1)
        //          count++;
        //     }
        //     if(max<count)
        //     {
        //         max=count;
        //         row=i;
        //     }
           
        // }
       

        // return row;

        //============ Method 2================
        int max_row=0;
        int r=a.length;
        int c=a[0].length;
        int left=c-1;
        int row=0;
        while(left>=0 && a[row][left]==1)
        left--;

        for(int i=1;i<r;i++)
        {
            while(left>=0 && a[i][left]==1)
            {
                left=left-1;
                max_row=i;
            }
        }
        if(left==c-1)
        return -1;
        return max_row;
    }
public static void main(String args[])
{
    int a[][]={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
    System.out.println("Max 1s is:"+max1s(a));
}
}