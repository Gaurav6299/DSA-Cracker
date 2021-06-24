import java.util.*;
class KthSmallestElementAgain
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
           int ar[][]=new int[n][2];
            for(int j=0;j<n;j++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                ar[j][0]=a;
                ar[j][1]=b;

            } 
        Arrays.sort(ar,(x,y)->Integer.compare(x[0],y[0]));
          int k=0;
          for(int j=1;j<ar.length;j++)
          {
              if(ar[k][1]>=ar[j][0])
              {
                  ar[k][1]=Math.max(ar[k][1],ar[j][1]);
              }
              else{
                  k++;
                  ar[k]=ar[j];
              }
          }

          for(int l=0;l<q;l++)
          {
              int m=sc.nextInt();
              int ans=-1;
              for(int j=0;j<=k;j++)
              {
                  int diff=ar[j][1]-ar[j][0]+1;
                  if(diff>=m)
                  {
                      ans=ar[j][0]+m-1;
                      break;
                  }
                  else{
                      m=m-diff;
                  }
              }
              System.out.println(ans);
          }
        }
        
    }

}