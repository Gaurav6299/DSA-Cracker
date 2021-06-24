// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.
// Or Find the Repeating and missing element
// T(c)=o(n)
// space=o(n)
class FindMissingAndRepeating
{
    static int[] missingAndRepeating(int a[])
    {
       int temp[]=new int[a.length+1];
       for(int i=0;i<temp.length;i++)
       {
           temp[i]=0;

       }
       for(int i=0;i<a.length;i++)
       {
           temp[a[i]]++;
       }

        int ar[]=new int[2];
        int k=0;
       for(int i=1;i<temp.length;i++)   //because ranges is [1,2,3...n]
       {
           if(temp[i]>1)   //find the repeating element
           {
               ar[k]=i;
               k++;
               break;
           }
       }
       for(int i=1;i<temp.length;i++)
       {
           if(temp[i]==0)   //find missing element
           {
               ar[k]=i;
               break;

           }
       }
       return ar;
    }
    public static void main(String args[])
    {
        int a[]={3,3,2};
        int b[]=missingAndRepeating(a);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}