// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

// T(c)=o(n)
import java.util.HashMap;

public class ContainsDuplicate {
    static boolean findAbsoluteDiff(int a[],int k)
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(m.containsKey(a[i]))
            {
                int index=i;
                int index2=m.get(a[i]);
                if(Math.abs(index-index2)<=k)
                return true;
            }
            m.put(a[i],i);
        }
        return false;

    }
    public static void main(String[] args) {
        int a[]={1,0,1,1};
        int k=1;
        System.out.println(findAbsoluteDiff(a,k));
    }
    
}
