// Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

// Note: For integers having same number of set bits in their binary representation, sort according to their position in the original array i.e., a stable sort.public class SortTheElementBySetBitDesc {
    
    
import java.util.*;

class SortTheElementBySetBitDesc
{
    int val;
    int count;
    int pos;
    SortTheElementBySetBitDesc(int val,int count,int pos)
    {
        this.val=val;
        this.count=count;
        this.pos=pos;
    }
public static void main(String args[])
{
    int a[]={1, 2, 3, 4, 5, 6};
    ArrayList<SortTheElementBySetBitDesc> l=new ArrayList<>();
    for(int i=0;i<a.length;i++)
    {
        l.add(new SortTheElementBySetBitDesc(a[i],CountBits(a[i]),i));
    }
    Collections.sort(l,(x,y)->x.count==y.count?x.pos-y.pos:y.count-x.count);
    int i=0;
    int b[]=new int[a.length];
    for(SortTheElementBySetBitDesc k:l)
    {
        b[i++]=k.val;

    }

    for(int j=0;j<b.length;j++)
    {
        System.out.print(b[j]+" ");
    }
}

static int CountBits(int x)
{
    int count=0;
    while(x!=0)
    {
      count++;
      x=x&(x-1);
    }
    return count;
}
}
