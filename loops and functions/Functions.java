import java.util.*;

public class Functions {
  public static  int add (int a, int b){  //parameters or formal parameter
      return (a+b);
    }

  public static int add(int a,int b,int c){ /// function overloading by no. of values 
    return (a+b+c);
  }


  public static float add(float a, float b) {  /// function overloading by type of variables 
    return (a+b);
  }


  public static int factorial (int n) {
      
      int fact=1;
    for(int i=1; i<=n; i++){
       fact = fact * i;
    }
    return fact;
  }

  public static int biCoeff(int n, int r){
    int n_fac = factorial(n);
    int r_fac = factorial(r);
    int nmr_fac = factorial((n-r));

    int bicoef = (n_fac/(r_fac*nmr_fac));
    return bicoef;
  }

  public static boolean isPrime(int n){
    boolean isprime=true;
    if(n==2) return true;
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n % i == 0 ) {
       isprime = false;
       break;
      }
    }
    return isprime;
  }

  public static void printPrime(int n){
    for(int i=2; i<=n; i++){
      if(isPrime(i) == true){
         System.out.print(" "+ i);
      }else{
         continue;
      }
    }
  }

  public static int bintoDec(int n){
    int dec=0; 
    int power=0;
    do{
      int last = n%10;
      dec = dec + (last*(int) Math.pow(2, power));
      n = n/10;
      power ++;
    }while(n >0);
    return dec;
  }

  public static int reverse(int n){
    int sum =0; 
    while(n>0){
      int r = n%10;
      sum = sum*10 + r;
      n = n/10;
    }
    return sum;
  }

  public static int dectoBin(int n){
    int bin=0;
    int pow =0;
    while (n>0){
      int r = n%2;
      bin = (int)( bin+(r*Math.pow(10,pow)));
      n = n/2;
      pow ++;
    }
    return (bin);

  }



  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

  //  System.out.println("enter number:");
  //  int in = sc.nextInt();
  //  printPrime(in);
  
  // int bin = 1011;
  // System.out.println("before conversion : "+ bin);
  // int dec = bintoDec(bin);
  // System.out.println("after conversion dec: "+ dec );
  // System.out.println("now back to iniitial state: "+ dectoBin(dec));


  // find out whether a given number is palindrome or not ; 
     System.out.println("\n please enter your numb: ");
     int in = sc.nextInt();

     int rev = reverse(in);
     if(in == rev){
      System.out.println(" your num is PALINDROME ");
     }else{
      System.out.println("your givn num is NOT PALINDROME");
     }

  }
}
