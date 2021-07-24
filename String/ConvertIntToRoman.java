// Convert Integer to Roman.
import java.util.*;
class ConvertIntToRoman
{
    static String convertRoman(int n)
    {
        Map<String,Integer> m=new LinkedHashMap<>();
        m.put("M",1000);
        m.put("CM",900);
        m.put("D",500);
        m.put("CD",400);
        m.put("C",100);
        m.put("XC",90);
        m.put("L",50);
        m.put("XL",40);
        m.put("X",10);
        m.put("IX",9);
        m.put("V",5);
        m.put("IV",4);
        m.put("I",1);

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<String,Integer>m1:m.entrySet())
        {
             while(n>=m1.getValue())
             {
                 n=n-m1.getValue();
                 sb.append(m1.getKey());
             }
        }
        return sb.toString();
    }


    public static void main(String args[])
    {
        int n=4;
        System.out.println("Convert Integer to Roman:"+convertRoman(n));

    }
}