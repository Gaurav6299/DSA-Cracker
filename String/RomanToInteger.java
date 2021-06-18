// Convert Roman To Integer
// T(c)=o(n)
//Space=o(1)
class RomanToInteger
{
    static int convert(String s)
    {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int x=findInteger(s.charAt(i));
            if(i+1<s.length())
            {
                int y=findInteger(s.charAt(i+1));
                if(x>=y)
                {
                    res+=x;

                }
                else{
                    res=res+y-x;
                    i++;
                }
            }
            else
            res+=x;
        }
        return res;
    }

    static int findInteger(char c)
    {
        if(c=='I')
        return 1;

        if(c=='V')
        return 5;

        if(c=='X')
        return 10;

        if(c=='L')
        return 50;

        if(c=='C')
        return 100;

        if(c=='D')
        return 500;

        if(c=='M')
        return 1000;

        return -1;

    }
  public static void main(String args[])
  {
      String s="MC";
      System.out.println("Convert Roman To Integer:"+convert(s));
  }
}