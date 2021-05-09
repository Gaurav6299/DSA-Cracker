// Sort the array where the array have the element only 0th ,1th and 2th

class Sort0th1th2thElement
{
    static void sortArray(int a[])
    {
       int l=0;
       int mid=0;
       int h=a.length-1;
       int temp=0;
       while(mid<=h){
           switch(a[mid])
           {
               case 0:
               {
                   temp =a[l];
                   a[l]=a[mid];
                   a[mid]=temp;
                   l++;
                   mid++;
                   break;
               }
               case 1:
               {
                   mid++;
                   break;
               }

               case 2:
               {
                   temp=a[mid];
                   a[mid]=a[h];
                   a[h]=temp;
                   h--;
                   break;
               }
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
   int a[]={0,2,1,2,0};
   sortArray(a);
   printArray(a);
}
}