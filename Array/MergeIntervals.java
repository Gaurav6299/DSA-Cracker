// Merge the Overlapping Intervals
import java.util.*;
class MergeIntervals
{
    static int[][]  intervals(int a[][],int n)
    {
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        Stack<int[]> st=new Stack<>();
        st.push(a[0]);
        for(int i=1;i<a.length;i++)
        {
            int start2=a[i][0];
            int end2=a[i][1];
            int popArray[]=st.pop();
            int start1=popArray[0];
            int end1=popArray[1];
            int endMax=Math.max(end1,end2);
            if(end1>=start2)
            {
                int merge[]=new int[]{start1,endMax};  //start1 is left extreme and endMax is rightExtreme
                st.push(merge);

            }
            else
            {
                st.push(popArray);
                st.push(a[i]);
            }
        }
          

            int out[][]=new int[st.size()][2];
            for(int j=out.length-1;j>=0;j--)
            {
                int s[]=st.pop();
                out[j][0]=s[0];
                out[j][1]=s[1];

            }      

          

            return out;

        }
        
    public static void main(String args[])
    {
        int a[][]={{1,3},{2,6},{8,10},{15,18}};
        int n=a.length;
        int k[][]=intervals(a,n);
        // System.out.println(k[1][0]);
        
        for(int i=0;i<k.length;i++)
        {
            for(int j=0;j<k[i].length;j++)
            {
                System.out.print(k[i][j]+" ");
            }
            System.out.println();
        }
    }
}