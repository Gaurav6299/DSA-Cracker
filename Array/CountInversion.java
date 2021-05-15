// Count Inverion Using Brute force;

class CountInversion
{
    static int inversionCount(int a[])
    {
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                count++;
            }
        }

        return count;
    }
    public static void main(String args[])
    {
        int a[]={2,4,1,3,5};
        System.out.println("Number of Inverion="+inversionCount(a));

    }
}