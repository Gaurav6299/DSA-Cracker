// Given a String S delete the characters which are present more than once consecutively..
class RemoveConsecutiveChar
{
    static String removeChar(String k)
    {
        String y="";
        int i=0;
        for(i=0;i<k.length()-1;i++)
        {
             if(k.charAt(i)!=k.charAt(i+1))
             {
                 y+=k.charAt(i);
             }
        }
        y+=k.charAt(i);

        return y;

    }
    public static void main(String args[])
    {
        String s="aabbaa";
        String h=removeChar(s);
        System.out.println(h);
    }
}