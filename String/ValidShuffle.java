// Check the given String is a valid shuffle of other two String or not..
// Hence the String is valid.. the order of string should be mentioned
// If Every characters of these two String is present inside the main String in the order so we can say that main string is a valid shuffle of other two string
class ValidShuffle
{
    static boolean checkValidShuffle(String first,String second,String main)
    {
        if(first.length()+second.length()!=main.length())
        return false;

        int i=0;
        int j=0;
        int k=0;

        while(k!=main.length())
        {
            if(i<first.length() && first.charAt(i)==main.charAt(k))
            i++;

            else if(j<second.length() && second.charAt(j)==main.charAt(k))
            j++;

            else
            return false;

            k++;
        }
return true;
    }
    public static void main(String args[])
    {
        String first="xy";
        String second="12";
        // String main="1xy2";
        String main="yx12";
        System.out.println("Is it valid shuffle:"+checkValidShuffle(first,second,main));
    }
}