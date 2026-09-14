import java.util.*;

public class loops {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // loops in java 
    // int x=10;
    // while (x>0) {
    //   System.out.println("hello i am upen");
    //   x--;

    // int n =1;
    // int s=0;
    // while (n<=5) {
    //   s = s+ n;
    //   n++;
    // }

    // System.out.println("sum is " + s);


    // For loops in java 
  //   int s=0;
  //   int n =10;
  //   for(int i =0 ; i<=n; i++){
  //     System.out.println("hello"+i);
  //     s = s+i;
  //   }
  //   System.out.println("sum is "+ s);
  // }


  // print the reverse of the number ;
  //  int n = 23462;
  //  int s = 0;
  //  while (n>0){
  //    int m = n%10;
  //    int r = n/10;
  //    s = s*10 + m;
  //    n=r;
  //  }

  //  System.out.println("YOur rvers is : "+ s);

  
    // // do while loop 
    // // take input from the user and exit the loop when it is multiple of 10
    // do{
    //   System.out.println("\nEnter your number : ");
    //   int input = sc.nextInt();

    //   if(input % 10 == 0){
    //     System.out.println("you have entered  multiple of 10 which is not allowed");
    //     continue;
    //   }
    //   System.out.println(" your entered number is "+ input);

    // }while(true);


    /// find if the given number is prime number or not
    do {
       System.out.println("\nEnter your number : ");
      int input = sc.nextInt();

      boolean isprime = true;
      for(int i=2; i< Math.sqrt(input); i++){
          if(input % i == 0){
            isprime =false;
            break;
          }else{
            isprime =true;
          }
      }

      if(isprime == false){
        System.out.println(input + " is not a prime number \n");
      }else{
        System.out.println(input + " is a prime number \n");
      }
      
    } while (true);
}
}
