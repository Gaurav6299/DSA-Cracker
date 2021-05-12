// Find the common element between the three Sorted Array
import java.util.*;
class CommonElementThreeArray
{
    static ArrayList<Integer> findCommon(int A[],int B[],int C[])
    {
        int n1=A.length;
        int n2=B.length;
        int n3=C.length;
        int i=0;
        int j=0;
        int k=0;
        ArrayList<Integer> l=new ArrayList<>();
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                l.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j])
            i++;
            else if(B[j]<C[k])
            j++;
            else k++;
        }
        return l;
    }
    public static void main(String args[])
    {
      int A[]= {1, 5, 10, 20, 40, 80};
       int B[] = {6, 7, 20, 80, 100};
       int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

       System.out.println(findCommon(A,B,C));
    }
}