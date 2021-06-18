// Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
class PartitionSubsetSumEqual
{
    static boolean twoSubsetSumEqual(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        if(sum%2!=0)   //if sum is odd so there is no two subset whose sums are equal.
        return false;

        int target=sum/2;    //if devide our sum beacuse if sum set is present inside the array, so we can assume another one is also Present.

        boolean dp[][]=new boolean[a.length+1][target+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=true;
        }

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(a[i-1]<=j)    //here j is iterate to target element which is present in all column.
                {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-a[i-1]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[a.length][target];
    }
    public static void main(String args[])
    {
        int a[]={1,5,11,5};
        System.out.println("Is it Exist:"+twoSubsetSumEqual(a));
    }
}