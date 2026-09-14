

public class patterns {
  public static void main(String args[]) {
    int n = 5;
    // for(int i=1; i<5; i++){
    // for(int j=1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }

    // // half pyramid
    // for(int i=1; i<=5; i++){
    // for(int j=1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }

    // // Character printing i.e a,bc,def,ghij
    // char ch= 'A';
    // for(int i=0; i<=5; i++){
    // for(int j=0; j<=i; j++){
    // System.out.print(ch);
    // ch++;
    // }
    // System.out.println(" ");
    // }

    // // 0-1 Traingle Pattern
    // int bool = 1;
    // boolean trig = true;
    // for(int i=0; i<5; i++){
    // for(int j=0; j<=i; j++){
    // if(trig == true){
    // bool = 1;
    // }else{
    // bool =0;
    // }
    // System.out.print(bool);
    // trig = !trig;
    // }
    // System.out.println(" ");
    // }

    // // Solid Rhombus pattern
    // int n=5;
    // for(int i=1; i<=5; i++){
    // for(int j=1; j<=9; j++){
    // if(j> n-i && j<=2*n-i){
    // if(i==1 || i==5 || j== n+1-i || j == (2*n - i)){
    // System.out.print("Ganesh");
    // }else{
    // System.out.print(" ");
    // }
    // }else{
    // System.out.print(" ");
    // }
    // }
    // System.out.println(" ");
    // }

    // // Number pyramid
    // int n=5;
    // for(int i =1; i<=n; i++){
    // for(int j=1; j<=2*n; j++){
    // if(j>n-i && j<2*n-(n-i)){
    // if(i %2 ==0 && j%2 ==0){
    // System.out.print(i);
    // }else if(i %2 !=0 && j%2 !=0){
    // System.out.print(i);
    // }else{
    // System.out.print(" ");
    // }

    // }else{
    // System.out.print(" ");
    // }
    // }
    // System.out.println(" ");
    // }

    // Palindromic pattern with numbers pattern
    // // Number pyramid
    // int n = 5;
    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=n; j++){
    // if(j>n-i && j<=n){
    // for(int k=i; k>=1; k--){
    // System.out.print(k);
    // }break;
    // }else{
    // System.out.print(" ");
    // }
    // }
    // for(int j=n+1; j<=2*n; j++){
    // if(j>=n+1 && j<=2*n-(n-i) && i>1){
    // for(int k=2; k<=i; k++){
    // System.err.print(k);
    // }break;
    // }else{
    // System.out.print(" ");
    // }
    // }
    // System.out.println(" ");
    // }

    /// hollow rectangle

    // for(int i =1; i<=5; i++){
    // for(int j=1; j<=5; j++){
    // if(i>1 && i<5 ){
    // if(j>1 && j<5){
    // System.out.print(" ");
    // }else{
    // System.out.print("*");
    // }
    // }else{
    // System.out.print("*");
    // }
    // }
    // System.out.println(" ");
    // }

    // // Inverted half rotated pyramid
    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=n-i; j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }

    // // inverted half pyramid with number
    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=n-i+1; j++){
    // System.out.print(j);
    // }
    // System.out.println(" ");
    // }

    // // Floyd's triangle
    // int s=1;
    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=i; j++){
    // System.err.print(s);
    // s++;
    // }
    // System.out.println(" ");
    // }

    // // 0_1 Triangle
    // int s=1;
    // for(int i=1; i<=n; i++){
    // if(i%2 ==0){s=0;}else{s=1;}
    // for(int j=1; j<=i; j++){
    // System.err.print(s);
    // if(s==1){ s=0;}
    // else if(s==0){ s=1;}
    // }
    // System.out.println(" ");
    // }

    // // butterfly pattern
    // for(int i=1; i<=2*n; i++){
    // for(int j=1; j<=2*n; j++){
    // if(i<=n){
    // if(j>i && j<=2*n -i){
    // System.out.print(" ");
    // }else{
    // System.out.print("*");
    // }
    // }else if(i>n){
    // if(j>2*n-i+1 && j<i){
    // System.out.print(" ");
    // }else{
    // System.out.print("*");
    // }
    // }
    // }
    // System.out.println(" ");
    // }

    // // solid rhombus
    // for(int i=1; i<=n; i++){
    // for(int j=1; j<=n-i; j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=n; j++){
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }

    // hollow rhombus approach 2 ;
    // for (int i = 1; i <= n; i++) {
    //   // for space 
    //   for (int j = 1; j <= n - i; j++) {
    //     System.out.print(" ");
    //   }

    //   // for hollow rhombus
    //   for(int j=1; j<=n; j++){
    //     if(i==1 || i==n || j==1 || j==n){
    //       System.out.print("*");
    //     }else{
    //       System.out.print(" ");
    //     }
    //   }

    //   System.out.println(" ");
    // }

    // Diamond Pattern 
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
     for(int i=n; i>=1; i--){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }

  }
}