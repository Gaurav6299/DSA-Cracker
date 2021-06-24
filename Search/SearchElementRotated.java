// Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// Or
// Search the element in the Rotated and sorted array
 class SearchElementRotated
{
    static int search(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println("Target index  is:"+search(a,target));
    }
}