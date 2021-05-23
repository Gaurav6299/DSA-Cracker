class RotateMatrix
{
    static int R=3;
    static int C=3;
    static  void rotateMat(int a[][],int m,int n)
    {

         int row=0;
         int col=0;
         int prev,cur;
         while(row<m && col<n)
         {
         if(row+1==m || col+1==n)
         break;

         prev=a[row+1][col];
         for(int i=col;i<n;i++)
         {
             cur=a[row][i];
             a[row][i]=prev;
             prev=cur;
         }
         row++;
        //  System.out.print(prev);
         for(int i=row;i<m;i++)
         {
             cur=a[i][n-1];
             a[i][n-1]=prev;
             prev=cur;
         }
         n--;
        if(row<m)
        {
            for(int i=n-1;i>=col;i--)
            {
               cur= a[m-1][i];
               a[m-1][i]=prev;
               prev=cur;
            }
        }
        m--;

        if(col<n)
        {
            for(int i=m-1;i>=row;i--)
            {
               cur= a[i][col];
               a[i][col]=prev;
               prev=cur;
            }
        }
        col++;
    }
    }

    static void print(int a[][],int R,int C)
    {
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String args[])
{
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
print(a,R,C);
rotateMat(a,R,C);
System.out.println("After the clockwise rotation..");
print(a,R,C);
// System.out.print(a[R-2][C-1]);
}
}