// Check of the given String is palindrome or not.. return true if Yes.. otherwise false
class StringPalin
{
    static boolean checkPalin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        String s="abba";
        boolean k=checkPalin(s);
        System.out.println(k);
    }
}