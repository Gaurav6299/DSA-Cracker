// T(c)=o(n^2.logn)
// space=o(n^2)   because the size of the list is n^2.

// Sort all the elements inside the matrix.
import java.util.*;
class SortAllElementsMatrix
{
    static int[][] sortAll(int a[][],int N)
    {
        ArrayList<Integer> l=new ArrayList<>();

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                l.add(a[i][j]);
            }
        }
        Collections.sort(l);
        int k=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                a[i][j]=l.get(k);
                k++;
            }
        }

        return a;
    }

    static void print(int a[][],int N)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int a[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int N=4;
       int out[][]= sortAll(a,N);
       print(out,N);
    }
}