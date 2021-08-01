// The first line tells the number of test cases. Each test case consist of 2 lines. In the first line of the test case we have P the number of prata ordered. In the next line the first integer denotes the number of cooks L and L integers follow in the same line each denoting the rank of a cook.
// How many minimum number of time he will make  the given paratha.
// You need To display the minimum number of time to get the order done.
public class RotiParata {
    static boolean canWeMakeParata(int a[],int par,int mid)
    {
        int time=0;
        int paratha=0;
        for(int i=0;i<a.length;i++)
        {
            time=a[i];
            int j=2;
            while(time<=mid)
            {
                paratha++;
                time=time+(a[i]*j);
                 j++;
            }
            if(paratha>=par)
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        // int a[]={1,1,1,1,1,1,1,1};
        int a[]={1,2,3,4};
        int par=10;
        int low=0;
        int high=(int)1e9;
        int res=0;
        while(low<=high)
        {
             int mid=(low+high)/2;
             if(canWeMakeParata(a,par,mid))
             {
                res=mid;
                high=mid-1;
             }
             else{
                 low=mid+1;
             }
        }
         System.out.println(res);

    }
    
}
