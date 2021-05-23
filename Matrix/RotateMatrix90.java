// Rotate the matrix 90 degree by anti clockwise direction
// here N=3 represent the number of row and column
// Concept:--right to top, bottom to right,left to bottom, top to left
class RotateMatrix90
{
    static int N=3;
    static void rotateMat90(int a[][],int n)
    {
           for(int i=0;i<n/2;i++)
           {
               for(int j=i;j<n-i-1;j++)
               {
                   int temp=a[i][j];
                   a[i][j]=a[j][n-1-i];
                   a[j][n-1-i]=a[n-1-i][n-1-j];
                   a[n-1-i][n-1-j]=a[n-1-j][i];
                   a[n-1-j][i]=temp;
                //    break;
               }
           }
    }

    static void printMat(int a[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotateMat90(a,N);
        printMat(a,N);
    }
}