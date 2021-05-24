// Search an element inside the matrix..
// T(c)=o(R*C)
// space=o(1)
class SearchInMatrix
{
    static boolean searchMatrix(int a[][],int target)
    {
    // ============First Method================
        // int row=a.length;
        // int column=a[0].length;
        // boolean f=false;
        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column;j++)
        //     {
        //         if(a[i][j]==target)
        //         {
        //             f=true;
        //             return f;
        //         }
        //     }

        // }
        // return f;

 //============Second Method==============

// Here the total number of elements present in the matrix is n*m and we did binary search over the whole matrix
// So T(c)=log(n*m)
// space=o(1)
int r=a.length;
int c=a[0].length;
 int low=0;
 int mid=0;
 int high= (r*c)-1;

 while(low<=high)
 {
    mid=low+(high-low)/2;
    if(a[mid/c][mid%c]==target)
    {
        f=true;
        return f;
    }
    else if(a[mid/c][mid%c]<target){
        low=mid+1;

    }else{
        high=mid-1;
    }
 }

    return f;
    }
    public static void main(String args[])

    {
        int a[][]={{1,3,5,7},{10,11,16,20},{23,30,24,60}};
        int target=3;
        System.out.println("Is it present:?"+searchMatrix(a,target));
    }
}