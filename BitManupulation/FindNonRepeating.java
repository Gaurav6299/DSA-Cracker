// You are given an array where all elements is present twice. You task is to find the non-repeating element inside the array.
// T(c)=o(n)
// Space=o(1)
class FindNonRepeating
{
    static int nonRepeating(int a[])
    {
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        return res;
    }
    public static void main(String args[])
    {
        int a[]={1,2,2,3,1,3,5};
        System.out.println("Non Repeating element is:"+nonRepeating(a));
    }
}