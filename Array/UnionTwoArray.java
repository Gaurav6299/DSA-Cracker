// Find the union of two Array... You are given two Array represented as a set your task is to find the union of two array 
//and also does not contains a duplicate element, retun the number of elements of union arrays

import java.util.*;
class UnionTwoArray
{
    static int findUnion(int a[],int b[])
    {

/*========= First Solution is here=========

    //     int n=a.length;
    //     int m=b.length;
        
    //    Set<Integer> s=new HashSet<>();
    //    for(int i:a)
    //    {
    //        s.add(i);
    //    }
    //    for(int j:b)
    //    {
    //        s.add(j);
    //    }
    //    System.out.println("Union array is:"+s);
    //    return s.size();

    */

    List<Integer> l=new ArrayList<>();
    int i=0;
    int j=0;
    while(i<a.length && j<b.length)
    {
        if(a[i]<b[j] && !l.contains(a[i]))
        {
            l.add(a[i]);
            i++;
        }
        else if(a[i]>b[j] && !l.contains(b[j]))
        {
            l.add(b[j]);
            j++;
        }
        else{
            if(!l.contains(a[i]))
            {
            l.add(a[i]);
            i++;
            j++;
            }
        }
    }

  if(i==a.length){
      while(j<b.length)
      {
          l.add(b[j]);
          j++;
      }
  }

  if(j==b.length)
  {
      while(i<a.length){
          l.add(a[i]);
          i++;
      }
  }

    System.out.println(l);
    return l.size();
    }
public static void main(String args[])
{
    int a[]={1,2,3,4};
    int b[]={5,6,7};
    System.out.println("The number of elements after union:"+findUnion(a,b));
}
}