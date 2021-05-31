// Given a String of paranthasis..your task is to check the given parenthasis is valid or not..
// If it is valid returns true otherwise false
// T(c)=o(n)
// Space=o(n) 

import java.util.*;
class BalancedParenthasisString
{
    static boolean balanced(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
            s.push(str.charAt(i));
            
            else
            {
                if(s.isEmpty())return false;

                else if(str.charAt(i)==']' && s.peek()!='[')
                return false;

                else if(str.charAt(i)==')' && s.peek()!='(')
                return false;

                else if(str.charAt(i)=='}' && s.peek()!='{')
                return false;

                s.pop();
            }
        }
        if(s.isEmpty())
        return true;
       return false; 
    }
    public static void main(String args[])
    {
        String s="{[()]}";
        System.out.println(balanced(s));
    }
}