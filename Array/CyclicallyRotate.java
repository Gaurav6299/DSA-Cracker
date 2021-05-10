//Given an array,rotate the array by one position in clockwise direction(leftRotation)
class CyclicallyRotate
{

static void rotateClockWise(int a[])
{
    int n=a.length;
    int temp=a[n-1];
    int i;
    for(i=n-1;i>0;i--)
    {
        a[i]=a[i-1];
    }
    a[i]=temp;
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
        int a[]={1,2,3,4,5};
        rotateClockWise(a);
        printArray(a);
    }
}
