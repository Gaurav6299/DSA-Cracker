import java.util.*;

import javax.net.ssl.SSLKeyException;

class TwoSum
{
    static int[] findSum(int a[],int target)
    {
       
        // Solution 1
        // T(c)=o(n^2)
        // int b[]=new int[2];
        // int k=0;
        // Stack<Integer> st=new Stack<>();
        // for(int i=0;i<a.length;i++)
        // {
        //     int x=target-a[i];
        //     for(int j=i+1;j<=a.length-1;j++)
        //     {
        //       if(x==a[j])
        //       {
        //         st.push(i);
        //         st.push(j);
        //       }
        //     }
        // }
        // for(int l:st)
        // {
        //     b[k]=l;
        //     k++;
        // }


        // Solution 2
         HashMap<Integer,Integer>m=new HashMap<>();
        int b[]=new int[2];
         for(int i=0;i<a.length;i++)
         {
             if(m.containsKey(target-a[i]))
             {
                 b[1]=i;
                 b[0]=m.get(target-a[i]);
             }
             else{
                 m.put(a[i],i);
             }
         }
        return b;
    }
    public static void main(String[] args) {
        int a[]={3,3};
        int target=6;
        System.out.println(Arrays.toString(findSum(a,target)));
    }
}