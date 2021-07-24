// You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
// T(c)=o(no of setBits) or o(1)
// space=0(1)
class ConvertAtoB
{
    static int convert(int a,int b)
    {
        int count=0;
        int c=a^b;
        while(c!=0)
        {
            count++;
            c=c&(c-1);
        }
        return count;

    }
    public static void main(String arg[]){
    int a=20;
    int b=25;
    System.out.println("Number Bits is:"+convert(a,b));
    }

}
