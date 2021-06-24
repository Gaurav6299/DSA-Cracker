// Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

class FindPair
{
    // Method 1
    // T(c)=o(n2)
    // space=o(1);
    static boolean pair(int a[],int n)
    {
        // for(int i=0;i<a.length-1;i++)
        // {
        //     for(int j=i+1;j<a.length;j++)
        //     {
        //         if(a[j]-a[i]==n)
        //         {
        //         return true;
        //         }

        //     }
        // }
        // return false;

        // ==============Efficient Approach==============
        int i=0;
        int j=1;
        while(i<a.length &&j<a.length)
        {
            if(i!=j && a[j]-a[i]==n)
            return true;

            else if(a[j]-a[i]<n)
            j++;
            else
            i++;

        }
        return false;
    }
    public static void main(String args[])
    {
        // int a[]= {5, 20, 3, 2, 50, 80};
        int a[]={10,30,100,40,200};
        int n=90;
        System.out.println("Is it pair exist:"+pair(a,n));
    }
}