class FindNumberOfCustomers
{
    static int findCustomers(String s,int n)
    {
        int res=0;  //it will count the number of customers who could not get a computer.
        int count=0;  //it will count the occupied computer
        char c[]=new char[256];

        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'A';
            if(c[x]==0)
            {
                c[x]=1;
                if(count<n)
                {
                    count++;
                    c[x]=2;
                }
                else
                {
                    res++;
                }
            }
            else{
                if(c[x]==2)
                {
                    count--;
                }
                c[x]=0;

            }

        }

        return res;
    }
    public static void main(String args[])
    {
        // String s="GACCBDDBAGEE";
        String s="ABCDEFEABC";
        int n=3; //number of computers
        System.out.println("Number of customers who could not get a computer:"+findCustomers(s,n));
    }
}