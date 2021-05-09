// Find the Maximum and Minimum number in an array.

class MaximumAndMinimum
{

    static int findMax(int a[],int n)
    {
        int max=Integer.MIN_VALUE;
        if(n==1)
        return a[0];
        else{
        
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }

        }
    }
        return max;
    }

    static int findMin(int a[],int n){
        int min=Integer.MAX_VALUE;
        if(n==1)
        return a[0];
        else{
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            min=a[i];
        }

}
        return min;
    }
    static void print(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
       int a[]={1000,11,445,1,330,3000};
       int n=a.length;
       print(a,n);
       System.out.println();
       System.out.println("Maximum number is:"+findMax(a,n));

       System.out.println("Minumnumber is:"+findMin(a,n));
    }
}