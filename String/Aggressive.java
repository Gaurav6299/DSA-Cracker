import java.util.Scanner;

class Aggressive
{
    static int aggressiveCows(int a[],int C)
    {
        int n=a.length;
        int l=a[0];
        int h=a[n-1]-a[0];
        int res=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(canPlaceCows(a,C,mid))
            {
                res=mid;
                l=mid+1;
            }
            else
            h=mid-1;


        }

        return res;
    }

    static boolean canPlaceCows(int a[],int C,int mid)
    {
        int x=a[0];
        int count=1;
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            if(a[i]-x>=mid)
            {
                count++;
                x=a[i];
            }
        }
        if(count==C)
        return true;
        else
        return false;
    }
public static void main(String args[])
{
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int N=sc.nextInt();
        int C=sc.nextInt();
        int ar[]=new int[N];
        for(int j=0;j<N;j++)
        {
          ar[j]=sc.nextInt();
        }
        System.out.println(aggressiveCows(ar,C));
    }
}
}