// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// T(c)=o(n)
// space=o(1)
class ValidPalindrome
{
    static boolean checkPalin(String s)
    {
        String y=s.toLowerCase();
        String k="";
        for(int i=0;i<y.length();i++)
        {
            if(Character.isAlphabetic(y.charAt(i)) || Character.isDigit(y.charAt(i)))
            {
                k+=y.charAt(i);
            }
        }
        int i=0;
        int j=k.length()-1;
        while(i<=j)
        {
            if(k.charAt(i)!=k.charAt(j))
            return false;
          i++;
          j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        String s="A man, a plan, a canal: Panama";
        System.out.println("Is it Palindrome:"+checkPalin(s));
    }
}