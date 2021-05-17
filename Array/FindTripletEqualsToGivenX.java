class FindTripletEqualsToGivenX
{
    static boolean findTriplet(int a[],int x)
    {
        //First Solution T(c)=o(n^3);

        // int count=0;
        // int n=a.length;
        // for(int i=0;i<n-2;i++)
        // {
        //    int sum=0;
        //     for(int j=i+1;j<n-1;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //           sum=a[i]+a[j]+a[k];
        //           if(sum==x){
        //               count++;
        //           }
        //         }
        //     }

           
        // }
        //  System.out.println("count is:"+count);


        //====================== Second Solution===============
        // T(c)=0(n^2)
        sortArray(a);

         int n=a.length;
         boolean f=false;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(a[i]+a[j]+a[k]==x)
                {
                f=true;
                System.out.println("The Triplets is:"+"("+a[i]+", "+a[j]+" ,"+a[k]+")");
                return f;
                }
                else if(a[i]+a[j]+a[k]<x)
                j++;
                else 
                k--;
            }
        }

        return f;
    }

// This is for method second
    static void sortArray(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,4,3,6};
        int x=10;
        boolean k=findTriplet(a,x);
        System.out.println("Is is triplets:"+k);
    }
}