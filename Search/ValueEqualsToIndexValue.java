// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value.
// condition is: if (value=index+1) condition  to check value equal to given index or not.
// T(c)=o(n);
import java.util.*;
class ValueEqualsToIndexValue
{
    static ArrayList<Integer> valueEqualToIndex(int a[]){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==i+1)
            l.add(a[i]);
        }
        return l;
    }
    public static void main(String args[])
    {
        int a[]={15,2,45,12,7};
        System.out.println("Value is:"+valueEqualToIndex(a));
    }
}