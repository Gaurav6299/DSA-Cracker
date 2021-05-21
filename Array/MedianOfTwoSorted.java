//Find the median of two Sorted Array of Equals size..
class MedianOfTwoSorted
{
    static int finaMedainOfTwoArray(int a[],int b[])
    {
        int n=a.length;
        int i=0;
        int j=n-1;
        int mid=(i+j)/2; //if two Arrays are same length so mid index is same for two Arrays.
        if(n%2==0)
        {
            int medain1=(a[mid]+a[mid+1])/2;
            int median2=(b[mid]+b[mid+1])/2;
            int totalMedian=(medain1+median2)/2;
            return totalMedian;
        }
        int median=(a[mid]+b[mid])/2;
        return median;
    }
    public static void main(String args[])
    {
        int a[]={1,12,15,16,18};
        int b[]={10,12,15,20,21};
        System.out.println("Medain elements of two Sorted Array of Equal size:"+finaMedainOfTwoArray(a,b));
    }
}