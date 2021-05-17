// Check the Array a2 is a subset of array a1 or not...
import java.util.*;
class ArrayIsASubSetOfAnotherArray
{
    static String oneArrayIsASubSetOfAnotherArray(int a1[],int a2[])
    {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:a1)
        {
            l.add(i);
        }

        for(int i=0;i<a2.length;i++)
        {
            if(!l.contains(a2[i])){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String args[])
    {
        int a1[]={11,1,13,21,3,7};
        int a2[]={11,3,7,1};
        String s=oneArrayIsASubSetOfAnotherArray(a1,a2);
        System.out.println("Is it subset :"+s);
    }
}