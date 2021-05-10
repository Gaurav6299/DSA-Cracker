// Find the Minimum number of jump to reach the end of the array?

class MinimumNumberJump
{
    static int minimumJump(int a[])
    {
        int n=a.length;
        int maxReach=a[0];
        int step=a[0];
        int jump=1;
        if(n==1)
        return 0;
        else if(a[0]==0)
        return -1;
        else{
            for(int i=1;i<n;i++)
            {
                if(i==n-1)
                return jump;

                maxReach=Math.max(maxReach,a[i]+i);
                step--;
                if(step==0)
                {
                    jump++;
                    if(i>=maxReach)
                    return -1;

                    step=maxReach-i;
                }
            }

            return jump;
        }
    }
    public static void main(String args[])
    {
        int a[]={1,3,5,8,9,2,6,7,6,8,9};
        System.out.println("Minimum Number of jump is===> " + minimumJump(a));
    }
}