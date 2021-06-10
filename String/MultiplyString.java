// T(c)=o(n*m)
// where m=length of first string
// And n=length of second String
// space=o(n*m)
class MultiplyString
{
    static String multiply(String s1,String s2)
    {
        int ar[]=new int[s1.length()+s2.length()];
        if(s1.equals("0") || s2.equals("0"))
        return "0";

        for(int i=s2.length()-1;i>=0;i--)
        {
            int a=s2.charAt(i)-'0';
            for(int j=s1.length()-1;j>=0;j--)
            {
                int b=s1.charAt(j)-'0';
                int mul=a*b;
                int pos1=i+j+1;     //this is for remainder
                int pos=i+j;        //this is division
                ar[pos1]+=mul%10;
                ar[pos]+=mul/10;
            }

        }

        StringBuilder str=new StringBuilder();
        int carry=0;
        for(int i=ar.length-1;i>=0;i--)
        {
            int val=ar[i]+carry;
            carry=val/10;
            ar[i]=val%10;
            if(i>0 || ar[i]!=0)
            str.append(ar[i]);
        }
        return str.reverse().toString();
    }
    public static void main(String args[])
    {
        String s1="9";
        String s2="99";
        System.out.println("Multiplication is:"+multiply(s1,s2));
    }
}