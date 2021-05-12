//Find the next greater permutations of the given array ...
class GreaterPermutations
{
    static void nextPermutations(int a[])
    {
        int n=a.length;
        int j=n-2;
        while(j>=0 && a[j]>a[j+1])
        j--;

        if(j==-1)
        {
            reverse(0,n-1,a);
            return;
        }

        for(int i=n-1;i>j;i--)
        {
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                break;
            }
        }

        reverse(j+1,n-1,a);


    }

    static void reverse(int i,int j,int a[])
    {
        while(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
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
        int a[]={1,2,3};
        nextPermutations(a);
        printArray(a);
    }
}