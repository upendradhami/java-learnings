import java.util.*;

public class JavaBasicsQuestion {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

  //  //Ques 1: print avg of 3 number after taking inputs of them
  
  //    System.out.println("Enter three number ");
  //    int a = sc.nextInt();
  //    int b = sc.nextInt();
  //    int c = sc.nextInt();

  //    int avg = (a+b+c)/3;
  //    System.out.printf("your average is : %d",avg);


  /// Q.2 .. enter cost of 3 items from the user using float data type = a pencil,a pen and an eraser and print out as their bill with the 18% gst add 
  
    // System.out.println("Enter the cost of a pencil: ");
    // float pencil = sc.nextFloat();
    // System.out.println("Enter the price of a pen: ");
    // float pen = sc.nextFloat();
    // System.out.println("Enter the price of an eraser: ");
    // float eraser = sc.nextFloat();

    // float sum = (pencil+pen+eraser);
    // float sumwithGST = sum +(0.18f) *sum;

    // System.out.printf("\n\n--------price of pen:---------= %f \n pencil:------------------= %f \n eraser:------------------= %f \n --------------------------------- \n Total sum is:---------= %f \n grand total with 18%% GSt ---------= %f",pen,pencil,eraser,sum,sumwithGST);

    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d= 99.2342;

    System.out.println(((Object)((f*b)+(i*c)-(d*s))).getClass().getSimpleName());

    int $ =25;
    System.out.println($);

    
      }
}
