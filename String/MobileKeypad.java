// Convert a sentence into its equivalent mobile numeric keypad sequence
// Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 
class MobileKeypad
{
    static String convertMobileNumber(String s,String a[])
{
    String k="";
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==' ')
        k+="0";

        else{
            int pos=s.charAt(i)-'A';   //here we find the keypad number
            k+=a[pos];
        }
    }

    return k;
}
    public static void main(String args[])
    {
        // Storing character position sequence in array
        String a[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666",
        "7","77","777","7777","8","88","888","9","99","999","9999"};

        String s="GAURAV";
        System.out.println("String in numeric mobile number:"+convertMobileNumber(s,a));
    }
}