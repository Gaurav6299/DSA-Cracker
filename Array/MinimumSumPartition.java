class MinimumSumPartition
{
    public static int partition(int arr[], int n) 
	{ 
	   int sum=0;
	   for(int i=0;i<n;i++)
	   {
	       sum+=arr[i];
	       
	   }
	   
	  boolean dp[][]=new boolean[arr.length+1][sum+1];
	  for(int i=0;i<dp.length;i++)
	  {
	      dp[i][0]=true;
	  }
	  for(int i=1;i<dp.length;i++)
	  {
	      for(int j=1;j<dp[0].length;j++)
	      {
	          if(arr[i-1]<=j)
	          {
	              dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
	          }
	          else
	          {
	              dp[i][j]=dp[i-1][j];
	          }
	      }
	  }
	  
	  int min=Integer.MAX_VALUE;
	  for(int i=0;i<=sum/2;i++)
	  {
	      if(dp[arr.length][i]==true)
	      {
	          min=Math.min(min,sum-2*i);
	          
	      }
	  }
	  return min;
    }
    public static void main(String args[])
    {
    int a[]={1,6,5,11};
    int n=a.length;
    System.out.println("Absolute diff:"+partition(a,n));
}
}