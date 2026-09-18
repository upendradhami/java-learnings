public class RecursionBasics {

  // public static void printIncr(int n){
  // if(n== 1){
  // System.out.print( n);
  // return ;
  // }

  // System.out.print(n + " ");
  // printIncr(n-1);

  // }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    factorial(n - 1);
    int fn = n * factorial(n - 1);
    return fn;

  }

  public static int sumNatural(int n) {
    if (n == 1) {
      return 1;
    }
    int sum = n + sumNatural(n - 1);
    return sum;
  }

  public static int fibo(int n) {
    if (n == 0 || n == 1)
      return n;
    int fib1 = fibo(n - 1);
    int fib2 = fibo(n - 2);
    return fib1 + fib2;

  }

  public static void main(String[] args) {
    // printIncr(10);
    // System.out.println(factorial(5));
    // System.out.println(sumNatural(10));
      // System.out.println(fibo(6));

  }
}
