// Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
// If number contains a alternating Bits returns true,otherwise false;
// T(c)=o(1)

 class BinaryAlternatingBits
 {
     static boolean alternatingBits(int n)
     {
         int k=n>>1;
         int y=k^n;
         int ans=y&(y+1);
         if(ans==0)
         return true;
         return false;
     }
    public static void main(String[] args) {
        int n=6;
        n=10;
        System.out.println(alternatingBits(n));
    }
 }