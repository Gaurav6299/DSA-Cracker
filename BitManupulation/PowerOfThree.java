// T(c)=o(n)
class PowerOfThree
{
    static boolean powerOfThree(int n)
    {
        if(n==0)
        return false;

        if(n==1)
        return true;
        
        if(n%3!=0)
        return false;

        return powerOfThree(n/3);
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println("Is it:"+powerOfThree(n));
    }
}