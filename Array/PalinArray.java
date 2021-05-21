//Given a array.. Your task is to check all the elements present in the array are palindrome or not. 
//if all the elements the palindrome then return 1 otherwise 0. 
//here 1 for Yes and 0 for No.
class PalinArray
{
    static  int checkPalin(int a[],int n)
    {
        for(int i:a)
        {
            int rem=0;
            int rev=0;
            int temp=i;
            while(temp>0)
            {
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev!=i)
            return 0;
        }

        return 1;
    }

    public static void main(String args[])
    {
        int a[]={111,222,333,444,555};
        int n=a.length;
        System.out.println("Is it all elements are palindrome:"+checkPalin(a,n));
    }
}