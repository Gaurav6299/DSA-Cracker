// You are given an array where all element is present twice accept two elements.You need to find those two elements which is present ones in the array.
// T(c)=o(n)
// space=o(1)
import java.util.*;
class NonRepeating3
{
    static int[] nonRepeating(int a[])
    {
        int res=0;
        int b[]=new int[2];
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        int k=res & -res;  //it will give the right most set bits
        int x=0;
        int y=0;
        for(int i:a)
        {
            if((i&k)==0)
            {
               x=x^i;
            }
            else
            {
               y=y^i;
            }
            
        }
        // display the value in ascending order
        if(x<y)
        {
            b[0]=x;
            b[1]=y;
        }else{
            b[0]=y;
            b[1]=x;
        }
        return b;
    }
    public static void main(String arg[])
    {
        int a[]={1,2,3,1,2,4};
        System.out.println("Non Repeating element is:"+Arrays.toString(nonRepeating(a)));
    }
}