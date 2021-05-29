import java.util.*;
class CommonElementInAllRow
{
    static Set<Integer> findCommonElement(int a[][],int r,int c)
    {
        int rows=0;
        int cols=0;
        ArrayList<Integer> l=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i=cols;i<c;i++)
        {
            l.add(a[rows][i]);
        }

        for(int i=1;i<r;i++)
        {
            for(int j=cols;j<c;j++)
            {
                if(l.contains(a[i][j]))
                {
                    s.add(a[i][j]);
                }
            }
        }

        return s;
    }
    public static void main(String args[])
    {
        int a[][]={{1,2,1,4,8},{3,7,8,5,1},{8,7,7,3,1},{8,1,2,7,9}};
        int row=4;
        int col=5;
        System.out.println("Common Element in All Row:"+findCommonElement(a,row,col));
    }
}