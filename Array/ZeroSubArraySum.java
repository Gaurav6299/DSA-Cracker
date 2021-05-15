//Given an array,if there exist any subArray whose sum equals to zero then returns true otherwise false.
import java.util.*;
class ZeroSubArraySum
{
    static boolean sumEqualsToZero(int a[])
    {
        int n=a.length;
        boolean f=false;
        int sum=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(sum);
            sum+=a[i];
            if(s.contains(sum)){
                f=true;
                break;
            }
        }
        return f;
    }
public static void main(String args[])
{
int a[]={4,5,-9,2,1};
System.out.println("Is it exist ?:"+sumEqualsToZero(a));
}

}