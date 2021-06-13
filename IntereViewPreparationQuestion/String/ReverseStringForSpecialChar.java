// Reverse the STring without effecting the special Character?

import java.util.*;
class ReverseStringForSpecialChar
{
    static String  reverseWithoutEffect(char c[])
    {
        // First method
        // This array is stored the alphabetic character
        // T(c)=o(n)
        // space=o(n)
        List<Character> l=new ArrayList<>();
        for(int i=0;i<c.length;i++)
        {
            if(Character.isAlphabetic(c[i]))
            {
                l.add(c[i]);
            }
        }
        Collections.reverse(l);

        int i=0;
        int j=0;
        while(i<c.length)
        {
            if(Character.isAlphabetic(c[i]))
            {
                char temp=c[i];
                c[i]=l.get(j);
                l.set(j,temp);
                j++;
            }
             i++;
        }

    return String.valueOf(c);

        // Second and Efficient
        // T(c)=o(n)
        // Space=o(1)
        // Efficient Approach
        // int i=0;
        // int j=c.length-1;
        // while(i<=j)
        // {
        //     if(!Character.isAlphabetic(c[i]))
        //     i++;

        //     else if(!Character.isAlphabetic(c[j]))
        //     j--;

        //     else{
        //         char temp=c[i];
        //         c[i]=c[j];
        //         c[j]=temp;
        //         i++;
        //         j--;
        //     }
        // }

        // return String.valueOf(c);

    }
    public static void main(String args[])
    {
        String s="Ab,c,de!$";
        char c[]=s.toCharArray();
        System.out.println("Reverse String is:"+reverseWithoutEffect(c));
    }
}