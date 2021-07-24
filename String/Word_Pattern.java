// Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
import java.util.*;
class Word_Pattern
{
    static boolean match(String pattern,String s)
    {
        String y[]=s.split(" ");
        if(pattern.length()!=y.length)
        return false;

        Map<String,Character> m=new HashMap<>();
        Map<Character,String> m1=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            if(m.containsKey(y[i]) && m.get(y[i])!=pattern.charAt(i)|| 
            m1.containsKey(pattern.charAt(i)) && !m1.get(pattern.charAt(i)).equals(y[i]))
            {
                return false;
            }
            m.put(y[i],pattern.charAt(i));
            m1.put(pattern.charAt(i),y[i]);
        }
        return true;
    }
    public static void main(String args[])
    {
        String pattern="abba";
        String s="dog cat cat dog";
        System.out.println("Is it match:"+match(pattern,s));
    }
}