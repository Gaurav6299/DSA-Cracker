// Check wheather a String s2 is a rotations of s1 or not.
class CheckRotations
{
    static boolean rotations(String s1,String s2)
    {
       return (s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1);
    }
    public static void main(String args[])
    {
        String s1="ABCD";
        String s2="CDAB";
        if(rotations(s1,s2))
        {
            System.out.println("S2 is a rotation of s1....");
        }
        {
            System.out.println("S2 is not a rotations of s1..");
        }

    }
}