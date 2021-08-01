import java.util.*;
class Spiral11
{
    static int[][] spiralForm(int n)
    {
        int c[][]=new int[n][n];
        int t=0;
        int b=n-1;
        int l=0;
        int r=n-1;
        int x=1;
        while(x<=n*n)
        {
               for(int i=l;i<=r;i++)
               {
                  c[t][i]=x;
                  x++;
               }
               t++;

               for(int i=t;i<=b;i++)
               {
                   c[i][r]=x;
                   x++;
               }
               r--;

               for(int i=r;i>=l;i--)
               {
                   c[b][i]=x;
                   x++;
               }
               b--;

               for(int i=b;i>=t;i--)
               {
                 c[i][l]=x;
                 x++;
               }
               l++;
        }
        return c;
    }
  public static void main(String[] args) {
      int n=3;
      int a[][]=spiralForm(n);
      System.out.println(Arrays.deepToString(a));
  }
}