// You have to make a sentance from the given list of words
// T(c)=o(R*C)
// Space=o(R)
class PrintAllSentances
{
    static int R=3;  //here row column is not gievn we have to specify ourself  
    static int C=3;  //here column is also not specify

    static void printSentances(String a[][])
    {
        String out[]=new String[R];
        for(int i=0;i<C-1;i++)
        {
            if(a[0][i]!="")
            {
                findSentances(a,0,i,out);
            }
        }
    }

    static void findSentances(String a[][],int m,int n,String out[])
    {
        out[m]=a[m][n];
        if(m==R-1)
        {
            for(int i=0;i<R;i++)
            {
                System.out.print(out[i]+" ");
            }

            System.out.println();
             return;
        }

        for(int i=0;i<C;i++)
        {
            if(a[m+1][i]!="" && m<C)
            {
                findSentances(a,m+1,i,out);
            }
        }
    }
    public static void main(String args[])
    {
        String a[][]={{"you","we",""},{"have","are",""},{"sleep","eat","drink"}};
        printSentances(a);
    }
}