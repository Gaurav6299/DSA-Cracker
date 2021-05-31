// Find the common elements in a matrix that will be present in all rows.
// T(c)=o(r*c);
// // space=o(n)

import java.util.*;
class CommonElementInAllRow
{
    static void findCommonElement(int a[][],int r,int c)
    {
         Map<Integer,Integer> m=new HashMap<>();
         for(int i=0;i<c;i++)
         {
             m.put(a[0][i],1);
         }

         for(int i=1;i<r;i++)
         {
             for(int j=0;j<c;j++)
             {
                 if(m.get(a[i][j])!=null && m.get(a[i][j])==i)
                 {
                     m.put(a[i][j],i+1);
                     if(i==r-1)
                     {
                         System.out.print(a[i][j]+" ");
                     }
                 }
             }
         }

         return;
    }
    public static void main(String args[])
    {
        int a[][]={{1,2,1,4,8},{3,7,8,5,1},{8,7,7,3,1},{8,1,2,7,9}};
        int row=4;
        int col=5;
        findCommonElement(a,row,col);
    }
}