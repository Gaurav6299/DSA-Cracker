class MovePositiveAndNegative
{
    static void move(int a[])
    {
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            if(a[i]>0 && a[j]<0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            else if(a[i]<0 && a[j]<0)
            i++;

            else if(a[i]>0 && a[j]>0)
            j--;
            else {
                i++;
                j--;
            }
        }
    }
    static void printData(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]={-12,12,-13,-5,6,-7,5,-3,-6};
        move(a);
        printData(a);
    }
}