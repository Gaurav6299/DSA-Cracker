// Given an n x n matrix mat[n][n] of integers, find the maximum value of mat(c, d) – mat(a, b) over all choices of indexes such that both c > a and d > b.
// T(c)=o(n^4) neary equals to o(n^2)
class MaximumValue
{
    static int maxValue(int a1[][],int N)
    {
        int max=Integer.MIN_VALUE;
        for(int a=0;a<N-1;a++)   //this is for row
        {
            for(int b=0;b<N-1;b++) //this is column
            {
                for(int d=a+1;d<N;d++)  //this is for row
                {
                    for(int e=b+1;e<N;e++)  //this is column
                    {
                        if(max<(a1[d][e]-a1[a][b]))
                        {
                            max=a1[d][e]-a1[a][b];
                        }
                    }
                }
            }
        }

        return max;
    }
    public static void main(String args[])
    {
        int a[][]={{1,2,-1,-4,-20},{-8,3,4,2,1},{-3,8,6,1,3},{-4,-1,1,7,-6},{0,-4,10,-5,-1}};
        int N=5;
        System.out.println("Maximum Value is:"+maxValue(a,N));
    }
}