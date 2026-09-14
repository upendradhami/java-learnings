public class bitManipulation {

  public static void oddEven(int num) {
    int bitmask = 1;
    if ((num & bitmask) == 0) {
      System.out.println("given numis Even");
    } else {
      System.out.println("given number is Odd");
    }
  }

  public static void checkIbit(int n, int bit) {
    int num = n >> bit;
    int bitmask = 1;
    System.out.printf("checking %d by %dth bit, we get = %d", n, bit, (num & bitmask));
  }

  public static void setIBit(int n, int bit) {
    int bitmask = 1 << bit;
    System.out.printf("setting %d by %dth bit, we get = %d", n, bit, (n | bitmask));
  }

  public static void clearIBit(int n, int bit) {
    int bitmask = (1 << bit) ^ (~0);
    System.out.printf("clearing %d by %dth bit, we get = %d", n, bit, (n & bitmask));

  }

  public static int countSetBit(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) == 1)
        count++;
      n = n / 2;
    }
    return count;
  }

  public static boolean powerOfTwo(int n) {
    if ((n & 1) == 1)
      return false;
    int count = countSetBit(n);
    if (count == 1) {
      return true;
    } else {
      return false;
    }

  }

  public static void clearRangeBit(int num, int r, int l) {
    int left = (~0) << (l + 1);
    // // approach 1 for finding value of right
    // int n=0;
    // for(int i=0; i<r; i++){
    // n= n<<1 |1;
    // }
    // int right = n;
    // System.out.println(right);

    // approach 2 with 0(1)
    int right =(1<<2)-1;  //2^r -1
    int bitMask = left | right;

    System.out.println(num & bitMask);

  }


  // fast exponential 
  public static void fastExpo(int n){
    int ans = 1; 
    int a=n;
    while(a>0){
      if((a&1) !=0){
        ans = ans*n;
      }
      n=n*n;
      a=a>>1;
    }
    
    System.out.println("exponential value is: " + ans);
  }

  public static void add1(int n){

    // my approach of shifting and counting
    // if((n &1) == 1){
    //   int a=n;
    //   int count=0;
    //   while((a&1) == 1){
    //     count ++;
    //      a = a>>1;
    //   }
    //   a = ((a|1)<<count)&((~0)<<count);
    //   System.out.println("you add 1 to "+n +" you get "+ a);
    // }else{
    //  int a = n|1;
    //  System.out.println("you add 1 to "+n +" you get "+ a);
    // }


    // trick easy 
     int a = -(~n);
      System.out.println("you add 1 to "+n +" you get "+ a);
  }

  public static void main(String args[]) {
    // System.out.println(5&3);
    // System.out.println(5|3);
    // System.out.println(5<<2);
    // System.out.println(1>>1);
    // System.out.println(~0);
    // System.out.println(5^3);

    // oddEven(697);
    // checkIbit(10, 3);
    // setIBit(10, 0);
    // clearIBit(10,3);
    // countSetBit(13);

    // System.out.println(powerOfTwo(69));

    // clearRangeBit(10, 2, 4);
    // fastExpo(5);
    add1(18);

  }

}
