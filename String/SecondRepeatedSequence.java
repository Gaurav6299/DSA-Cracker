// Find the second Most Repeated String in a Sequence.
// T(c)=o(n);
// space=o(n);
import java.util.*;
class SecondRepeatedSequence
{
    static String secondRepeated(String k[])
    {
        Map<String,Integer> m=new HashMap<>();
        for(int i=0;i<k.length;i++)
        {
            m.put(k[i],m.getOrDefault(k[i],0)+1);
        }

        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        
        for(String i:m.keySet())
        {
            int x=m.get(i);
            if(x>max)
            {
                secMax=max;
                max=x;
            }
            else if(x>secMax && x<max)
            {
                secMax=x;
            }

        }
        for(Map.Entry<String,Integer>m1:m.entrySet())
        {
            if(m1.getValue()==secMax)
            return m1.getKey();
        }

        return null;
    }
    public static void main(String args[])
    {
        String s[]={"aaa","bbb","bbb","aaa","ccc","aaa"};
        System.out.println("Second=="+secondRepeated(s));

    }
}