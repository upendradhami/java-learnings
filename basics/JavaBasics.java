
import java.util.*;

public class JavaBasics {
  public static void main(String args[]) {

    Scanner sc= new Scanner(System.in);



    // // // System.out.print("hello World \n Hello World \n Hello World  ");
    // // System.out.println("*****");
    // // System.out.println("****");
    // // System.out.println("***");
    // // System.out.println("**");
    // // System.out.println("*");



    // int a = 10;
    // int b = 5;
    // System.out.println(a);
    // System.out.println(b);


    // String name = "tony Stark";
    // System.out.print(name);
    

    // // Taking inputs in java
    // Scanner sc= new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

   

    // System.out.println(a*b);
    // System.out.println(a+b);
    //  sc.nextLine();
    // // String input = sc.next();
    // // System.out.println(input);

    // String inputline = sc.nextLine();
    // System.out.println(inputline);


    // // implicit type conversion 
    // byte a =5;
    // int b = 4;
    // //System.out.print(((Object)(a+b)).getClass().getSimpleName());
    
    // int c=a;
    // // a= a + b; // not allowed from shorter type i.e 1 byte to 4 byte conversion

    // System.out.print(a);
    // System.out.print(c);
    // System.out.println();

    // // explicit conversion
    // a = (byte)(a+b); // now it is allowed , int to byte 
    // System.out.print(a);

    // int m = 24;
    // float n = 22.21f;
    // long o= 234;
    // double p = 97.22f;

    // System.out.println((int)(m+n+o+p));
    // // while performing expression calculation it takes highest possible type i.e. above is double but we can typecast though
    // System.out.print(((Object)(m+n+o+p)).getClass().getSimpleName());



    // // char in expression 
    // char a = 'a';
    // char b = 'b';
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println((int)a);
    // System.out.println((int)b);
    // System.out.println((a+b)); // a=97 and b=98

    //  System.out.println("Enter your tax: ");
    //  int income = sc.nextInt();

    //  int tax;
    //  if(income < 500000) {
    //     tax = 0;
    //  }else if(income >= 500000 && income <=1000000){
    //      tax = (int) (income* 0.2);
    //  }else{
    //      tax = (int) (income * 0.3);
    //  }

    //  System.out.printf("YOU have to pay %d amount of tax on your income", tax);

    // int marks = 35;
    // String res = (marks >= 33) ? "pass" : "fail";
    // System.out.println("\n you are now " + res);



    //  int a,b,op;

    //  System.out.println("Enter values of a and b for calculation: ");
    //  a = sc.nextInt();
    //  b = sc.nextInt();

    //  System.out.println("Enter what you want to perform : /n1.multiplication /n2.division /n3.addition /n4.subtraction /n 5.modulus");

    //  op = sc.nextInt();

    //  switch (op) {
    //   case 2: System.out.println("your division value is : " + (a/b));
    //     break;
    //   case 1: System.out.println("your multiplication value is : " + (a*b));
    //     break;

    //   case 5: System.out.println("your Addition value is : " + (a+b));
    //     break;
     
    //   case 3: System.out.println("your modulus value is : " + (a%b));
    //     break;

    //   case 4: System.out.println("your subtraction value is : " + (a-b));
    //     break;

    //   default: System.out.println("please enter valid operation ");
    //     break;
    //  }



  }
}