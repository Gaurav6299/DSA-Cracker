class Isomorphic
{
    static boolean checkIsomorphic(String s1,String s2)
    {
       int n=s1.length();
       int m=s2.length();

       if(n!=m)
       return false;

       int a[]=new int[256];
       int b[]=new int[256];
       for(int i=0;i<n;i++)
       {
           if(a[s1.charAt(i)]==0 && b[s2.charAt(i)]==0)
           {
               a[s1.charAt(i)]=s2.charAt(i);
               b[s2.charAt(i)]=s1.charAt(i);
           }
           else if(a[s1.charAt(i)]!=s2.charAt(i))
           return false;
       }

       return true;

    }
    public static void main(String arg[])
    {
        String s1="aab";
        String s2="xxy";
        System.out.println("Is it :"+checkIsomorphic(s1,s2));
    }
}