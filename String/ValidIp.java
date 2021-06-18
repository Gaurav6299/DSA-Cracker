// T(c)=o(n3)
import java.util.*;
class ValidIp
{
    static List<String> CheckValid(String s)
    {
        int n=s.length();
        List<String> l=new ArrayList<>();
        String y=s;
        for(int i=1;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                   y=y.substring(0,k)+"."+y.substring(k);
                   y=y.substring(0,j)+"."+y.substring(j);
                   y=y.substring(0,i)+"."+y.substring(i);
                   if(isValid(y))
                   {
                       l.add(y);
                   }
                   y=s;
                   
                }
                
            }
            
        }
    
        return l;
    }

static boolean isValid(String ip)
{
    String a[]=ip.split("[.]");
    for(String s:a)
    {
        int i=Integer.parseInt(s);
        if(s.length()>3 || i<0 || i>255)
        {
            return false;
        }
        if(s.length()>1 && i==0)
        return false;

        if(s.length()>1 && i!=0 && s.charAt(0)=='0')
        return false;

    }

    return true;
}

    public static void main(String args[])
    {
        String s="25525511135";
        System.out.println("Valid ip is:"+CheckValid(s));
    }
}