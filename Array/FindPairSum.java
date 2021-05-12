import java.util.*;
class FindPairSum
{
    static int  sumEqualsToK(int a[],int k)
    {
        int c=0;
        int n=a.length;
      /*========First Method ==========

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==k)
                {
                c++;
                }
            }
        }
        System.out.println("Number of pairs is:"+c);*/

        // Second Method Effiecient Approach
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!m.containsKey(k-a[i])){
                m.put(a[i],m.getOrDefault(a[i],0)+1);
            }
            else{
                c+=m.get(k-a[i]);
                m.put(a[i],m.getOrDefault(a[i],0)+1);
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        // int a[]={1,5,7,1};
        int a[]={1,1,1,1};
        int k=2;
        System.out.println("Number of pairs is:"+sumEqualsToK(a,k));
    }
}