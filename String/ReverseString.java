// Reverse a String you are given a char Array ..you task is to reverse the char Array and  display the Array in reverse order.
// Do not allocate any extra space
import java.util.*;
class ReverseString
{
    public static void main(String args[])
    {
        char c[]={'h','e','l','l','o'};
        int s=c.length;
        System.out.println(s);
        int i=0;
        int j=s-1;
        while(i<=j)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(c));
    }
}