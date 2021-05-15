// Count the number of inversion this is efficient approach..
//Time complexity is o(nlogn)
//space complexity is o(n);
class CountInversion1
{
    static int mergeSort(int a[],int l,int h)
    {
        int c=0;
        if(l<h)
        {
            int mid=(l+h)/2;

            //Total inversion=left subArray InversionCount +right SubArray InversionCount+ Merge SubArray InversionCount
            c+=mergeSort(a,l,mid);  //left subarray
            c+=mergeSort(a,mid+1,h); //right subarray
            c+=Merge(a,l,mid,h); //merge subarray
        }
        return c;
    }

    static int Merge(int a[],int l,int mid,int h)
    {
        int i=l;
        int j=mid+1;
        int k=l;
        int n=a.length;
        int b[]=new int[n];
        int inverCount=0;
        while(i<=mid && j<=h)
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;

            //Here we count the number of inversion that will count from starting position of the right array(mid+1) to ith position 
            //of the left array which is greater than the jth position of the right array...  

                inverCount+=mid+1-i;
            }
            k++;
        }

        if(i>mid)
        {
            while(j<=h)
            {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid)
            {
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for(int x=l;x<=h;x++)
        {
            a[x]=b[x];
        }
        return inverCount;
    }
    public static void main(String args[])
    {
        int a[]={2,4,1,3,5};
        int n=a.length;
        System.out.println("Number of Inversion="+mergeSort(a,0,n-1));
    }
}