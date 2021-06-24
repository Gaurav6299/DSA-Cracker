// A step array is an array of integers where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of x if multiple-element exist to return the first occurrence of the key.
// T(c)=o(n)
// Space=o(1)
class SearchElement
{
    static int search(int a[],int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[]={20, 40, 50, 70, 70, 60};  
        int k=20; //It represents the diffence between each element of the array.
        int x=60; //it is a key which i have to search
        System.out.println("Element found at index:"+search(a,x));
    }
}