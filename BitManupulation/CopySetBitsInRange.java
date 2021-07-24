// Copy set bits from y between the range(left,right) and add into the x in the same range .
// Or
// Given two numbers x and y, and a range [l, r] where 1 <= l, r <= 32. Find the set bits of y in range
// [l, r] and set these bits in x also.
public class CopySetBitsInRange {
 
    static int copySetBits(int x,int y,int l,int r)
    {
          int mask=1;
          mask=(mask<<(r-l+1));
          mask--;
          mask=(mask<<(l-1));
          mask=mask&y;
          x=x|mask;
          return x;
    }
  public static void main(String[] args) {
      int x=16;
      int y=3;
      int l=1;
      int r=3;
      System.out.println("Set bits is:"+copySetBits(x,y,l,r));
  }
}
