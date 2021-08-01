// Double helix problem
// T(c)=o(n+m)
// space=o(1)
import java.util.*;
public class DoubleHelix {
    static int printHelix(int a[],int b[])
    {
        int i=0;
        int j=0;
        int sum=0;
        int sum1=0;
        int sum2=0;
        if (a[0]==0)
        return  sum;
        while(i<a.length && j<b.length)
        {
             if(a[i]!=b[j])
             {
                 sum1+=a[i];
                 sum2+=b[j];
                 i++;
                 j++;
             }
             else{
                 sum+=Math.max(sum1,sum2)+a[i];
                 sum1=0;
                 sum2=0;
                 i++;
                 j++;
             }
        }

        while(i<a.length)
        {
            sum1+=a[i];
            i++;
        }

        while(j<b.length)
        {
            sum2+=b[j];
            j++;
        }
        sum+=Math.max(sum1,sum2);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
            int a=sc.nextInt();
            int ar[]=new int[a];
            for(int j=0;j<ar.length;j++)
            {
                ar[j]=sc.nextInt();

            }
            
            int b=sc.nextInt();

           
            int br[]=new int[b];
           

            for(int k=0;k<br.length;k++)
            {
              br[k]=sc.nextInt();
            }
          
            System.out.println("Sum is:"+printHelix(ar,br));
    }
    
}
