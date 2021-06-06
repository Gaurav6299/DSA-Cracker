// Minimum Number of Flips
// Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.
// T(c)=o(n)
// space=o(n)
class MinNumberOfFlip
{
    static int minFlip(String s,char exp)
    {
        int flip=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=exp)
            flip++;
            
            if(exp=='1')
            exp='0';
            else 
            exp='1';
        }

        return flip;
    }
    public static void main(String args[])
    {
        String s="0001010111";
        int x=Math.min(minFlip(s,'0'),minFlip(s,'1'));
        System.out.println("Minimum number of flips:"+x);
    }
}