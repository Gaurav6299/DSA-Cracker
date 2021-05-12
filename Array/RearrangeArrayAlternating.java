// Rearrange the array alternating positive and Negative number
class RearrangeArrayAlternating
{
    static void rearrange(int a[])
    {
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            if(a[i]<0 && a[j]>0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            else if(a[i]>0 && a[j]>0)
            i++;
            else if(a[i]<0 && a[j]<0)
            j--;

            else {
                i++;
                j--;
            }
        }

        if(i==0 || i==n){
            printArray(a);
        }

        else{
            int k=0;
            while(k<a.length && i<a.length)
            {
                int temp=a[k];
                a[k]=a[i];
                a[i]=temp;
                i++;
                k+=2;
            }
        }
       
    }
    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,-4,-1,4};
        rearrange(a);
        printArray(a);
    }
}