// Find the median Row-wise in a sorted matrix..
// T(c)=o(R*C.log(R*C))
// space=o(R*C);

import java.util.*;
class FindMedianRowWise
{
   static  int findMedian(int a[][])
    {
// ========First Method=============

        // ArrayList<Integer> l=new ArrayList<>();
        // int r=a.length;
        // int c=a[0].length;
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         l.add(a[i][j]);
        //     }
        // }

        // Collections.sort(l);
        // int i=0;
        // int j=l.size()-1;
        // int mid=(i+j)/2;
        // if(l.size()%2==0)
        // {
        //     int median=(l.get(mid)+l.get(mid+1))/2;
        //     return median;
        // }
        // return l.get(mid);




    //===============Second Method================ 
    // T(c)=o(r*log(r))
    // space =o(1)
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int r=a.length;
    int c=a[0].length;

    for(int i=0;i<r;i++)
    {
        min=Math.min(a[i][0],min);
        max=Math.max(a[i][c-1],max);

    }
    int desired=(r*c+1)/2;   //It will represent the median index;
    
    while(min<max)
    {
        int mid=min+(max-min)/2;
        int get=0;
        int place=0;  //count the number of element which is less then equals to median
        for(int i=0;i<r;i++)
        {
          get= Arrays.binarySearch(a[i],mid);

          if(get<0){
            get=Math.abs(get)-1;

            }
         else
            {
                   while(get<a[i].length && a[i][get]==mid)
                   {
                   get+=1;
                   
                   }
             }

             place+=get;
        }
        if(place<desired)
        {
            min=mid+1;
        }
        else{
            max=mid;
        }

    }

return min;
    }
    public static void main(String args[])
    {
        // int a[][]={{1},{2},{3}};
        // System.out.println(findMedian(a));

        int a[][]={{1,3,5,7},{10,11,16,20},{23,30,24,60}};
         System.out.println(findMedian(a));
        
    }
}