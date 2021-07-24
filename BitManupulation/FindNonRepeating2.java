// You are given an array that contains all elements twice except two elements. your task is to find those two elements which is non repeating inside the array.
// T(c)=o(n)
// Space=o(1)
class FindNonRepeating2
{
    static void nonRepeating(int a[])
    {
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        int temp=res;
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            int h=a[i]&1;
            if(h!=0)
            {
                k=k^a[i];
            }

        }
        int x=temp^k;
        int y=x^res;
        System.out.println("First nonRepeating is:"+x);
        System.out.println("Second nonRepating is:"+y);
    }
    public static void main(String arg[])
    {
        int a[]={1,2,3,2,3,4,5,1};
        nonRepeating(a);
    }
}