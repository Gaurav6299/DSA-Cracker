// Trapping Rain water..How much water can be trapped between the block ..here array is given that will represent the each 
//height of the block.

class TrappingRainWater
{
    static int trappingWater(int a[],int n)
    {
        int left[]=new int[n];
        int right[]=new int[n];
        int leftMax=0;
        int rightMax=0;
        for(int i=0;i<n;i++)
        {
            leftMax=Math.max(a[i],leftMax);
            left[i]=leftMax;
        }

        for(int i=n-1;i>=0;i--)
        {
            rightMax=Math.max(rightMax,a[i]);
            right[i]=rightMax;
        }

       int totalWater=0;
        for(int i=0;i<n;i++)
        {
           totalWater+=Math.min(left[i],right[i])-a[i];
        }

        return totalWater;
    }
    public static void main(String args[])
    {
        int a[]={7,4,0,9};
        int n=a.length;
        System.out.println("Water containing is:"+trappingWater(a,n));
    }
}