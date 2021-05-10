// Find the intersection of two Array
import java.util.*;
class IntersectionTwoArray
{

static List<Integer> intersection(int a[],int b[])
{
    List<Integer> l=new ArrayList<>();
    int n=a.length;
    int m=b.length;
    int i=0;
    int j=0;
    while(i<n && j<m)
    {
        if(a[i]==b[j])
        {
            l.add(a[i]);
            i++;
            j++;
        }
        else if(a[i]<b[j])
        {
            i++;
        }
        else
        j++;
    }
    return l;
}
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={3,5,6,7};
        System.out.println("Intersection is:"+intersection(a,b));
    }
}