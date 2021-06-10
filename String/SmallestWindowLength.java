// Find the smallest Window Length that will contains all distinct characters of the given String
class SmallestWindowLength
{
    static int c=256; 
    static int findWindowLength(String s)
    {
        int dist_count=0;
        boolean visited[]=new boolean[c];
        for(int i=0;i<s.length();i++)
        {
            if(visited[s.charAt(i)]==false)
            {
                dist_count++;
                visited[s.charAt(i)]=true;
            }
        }

        int min=Integer.MAX_VALUE;
        int i=0;
        int start=-1;
        int count=0;   //it will count the distinct character only
        int count_char[]=new int[c];
        for(int j=0;j<s.length();j++)
        {
            count_char[s.charAt(j)]++;
            if(count_char[s.charAt(j)]==1)
            count++;

            if(count==dist_count)
            {
                while(count_char[s.charAt(i)]>1)
                {
                    if(count_char[s.charAt(i)]>1)
                    {
                        count_char[s.charAt(i)]--;
                    }
                    i++;
                }

            int window=j-i+1;
            if(min>window)
            {
                min=window;
                start=i;
            }

        }
    }

       return s.substring(start,start+min).length();  //here start=6 and min=4
    }
    public static void main(String args[])
    {
        String s="aabcbcdbca";
        System.out.println("Smallest Window length:"+findWindowLength(s));
    }
}