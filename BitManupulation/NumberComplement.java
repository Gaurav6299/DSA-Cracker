// Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.
// Note:-First we need to check the what is our number, then i will check the number is of either 4bits,3bits etc..
// according to the bits we find the heightest number of the bits, then we will find the exor between  these number and original number.
class NumberComplement
{
    static int findComplement(int n)
    {
        int i=0;
        int j=0;
        while(i<n)
        {
          i+=  Math.pow(2,j);
          j++;
        }
        int k=i^n;
        return k;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(findComplement(n));
    }
}