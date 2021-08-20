// You are given three things..of jobs Start time,finsih time and profit? you need to find the maximum profit of subset of jobs 
// where two jobs are not overlap.

import java.util.*;
class Job
{
    int start;
    int finish;
    int profit;
    Job(int start,int finish,int profit)
    {
       this.start=start;
       this.finish=finish;
       this.profit=profit;
    }
}
    class finish implements Comparator<Job>
    {
        public int compare(Job a,Job b)
        {
            return a.finish<b.finish?-1:a.finish==b.finish?0:1;
        }
    }

    class MaximumProfitJob
    {
        static int binarySearch(Job job[],int index)
        {
            int lo=0;
            int hi=index-1;
            while(lo<=hi)
            {
                int mid=(lo+hi)/2;
                if(job[mid].finish<=job[index].start)
                {
                    if(job[mid+1].finish<=job[index].start)
                    {
                        lo=mid+1;
                    }
                    else
                    return mid;
                }
                else
                hi=mid-1;
            }
            return -1;
        }
   public static void main(String[] args) {
       
       Job job[]={new Job(1,2,50),new Job(3,5,20),new Job(6,19,100),
        new Job(2,100,200)};

        Arrays.sort(job, new finish());
        int n=job.length;
        int table[]=new int[n];
        table[0]=job[0].profit;
        for(int i=1;i<n;i++)
        {
            int x=job[i].profit;
            int y=binarySearch(job,i);
            if(y!=-1)
            x+=table[y];

            table[i]=Math.max(x,table[i-1]);

        }

 System.out.println(table[n-1]);
   }
}