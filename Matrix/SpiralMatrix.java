// Spiral matrix
class SpiralMatrix
{
    static int R=2;
    static int C=3;
    static void spiralTraverse(int a[][],int m,int n)
    {
        int row=0;
        int col=0;

        while(row<m && col<n)
        {
        for(int i=col;i<n;i++)
        {
            System.out.print(a[row][i]+" ");
        }
        row++;

        for(int i= row;i<m;i++)
        {
            System.out.print(a[i][n-1]+" ");
        }
        n--;

      if(row<m)
      {
        for(int i=n-1;i>=col;i--)
        {
            System.out.print(a[m-1][i]+" ");
        }
        m--;
      }

      if(col<n)
      {
          for(int i=m-1;i>=row;i--)
          {
              System.out.print(a[i][col]+" ");
          }
          col++;
      }

     }
}
    public static void main(String args[])
    {
        // int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int a[][]={{5, 11,30},{5,19,19}};
        spiralTraverse(a,R,C);
    }
}