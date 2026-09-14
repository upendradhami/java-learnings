public class practicePattern1 {
  public static void main(String args[]){
   int n = 5;
  
   /* beginner level 
  // hollow rectangle
      
    //   for(int i=0; i<n; i++){
    //   for(int j=0; j<n; j++){
    //     if(i==0 || i==n-1 || j==0 || j== n-1) {
    //        System.out.print("* ");
    //     }
    //     else{
    //        System.out.print("  ");
    //     }
       
    //   }
    //   System.out.printf("\n");
    // }


    // // For increasing Star triangle
    // for(int i=0; i<n; i++){
    //   for(int j=0; j<=i; j++){
    //      System.out.print("*");
    //   }
    //   System.out.println(" ");
    // }

    // for decreasing Star Triangle 
    
    // // For increasing Star triangle
    // for(int i=n-1; i>=0; i--){
    //   for(int j=i; j>=0; j--){
    //      System.out.print("*");
    //   }
    //   System.out.println(" ");
    // }

  //  // Increasing with repeated number Triangle
  //   for(int i=1; i<=n; i++){
  //     for(int j=1; j<=i; j++){
  //       System.out.print(i);
  //     }
  //     System.out.println(" ");
  //   }
  

  
    // For increasing Star triangle
    for(int i=n; i>=0; i--){
      for(int j=1; j<=i; j++){
         System.out.print(j);
      }
      System.out.println(" ");
    }

    */

   /* INTERMEDIATE LEVEL
    // // right align triangle 

    //  for (int i=n; i>0; i--){
    //   for(int j=0 ; j<n; j++){
    //     if(j>=i) {
    //       System.out.print("*");
    //     }else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.err.println(" ");
    //  }

    // for reverse right align i.e 5 spce 4 spac 3 spac 2 space 1
    
    //  for (int i=0; i<n; i++){
    //   for(int j=0 ; j<n; j++){
    //     if(j>=i) {
    //       System.out.print("*");
    //     }else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.err.println(" ");
    //  }

   // pyramid i.e for n=5, 1 3 5 7 9

    //  for (int i=1; i<=n; i++){
    //   for(int j=0 ; j<((2*n)-1); j++){
    //     if(j>=(n-i) && j<=(n+i-2)) {
    //       System.out.print("*");
    //     }else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.err.println(" ");
    //  }

     // for inverse pyramid 
    //  for (int i=0; i<=4; i++){
    //   for(int j=0 ; j<((2*n)-1); j++){
    //     if(j>=i && j<((2*n)-1-i)) {
    //       System.out.print("*");
    //     }else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.err.println(" ");
    //  }

   
    // // for number pyramid 
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=2*n-1; j++){
    //     if(j>(n-i) && j<(n+i)){
    //       for(int k=1; k<=(2*i-1); k++){
    //         System.out.print(k);
    //       }
    //       break;
    //     }else{
    //         System.out.print(" ");
    //       }
    //   }
    //   System.out.println();
    // }


    // // for repeated number pyramid
    
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=2*n-1; j++){
    //     if(j>(n-i) && j<(n+i)){
    //      System.out.print(i);
    //     }else{
    //         System.out.print(" ");
    //       }
    //   }
    //   System.out.println();
    // }
 

    // for floyd's triangle i.e 1 ,23,456,78910,1112131415
    int s=1;
    // for repeated number pyramid
    
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
       if(j<=i){
        System.out.print(s);
        s++;
       }else{
            System.out.print(" ");
          }
      }
      System.out.println();
    }

     */


   /*Advanced Level */
   // Hollow Square 

  //   for(int i=1; i<=n; i++){
  //     for(int j=1; j<=n; j++){
  //       if(i==1 || i==n || j==1 || j ==n){
  //         System.out.print("*");
  //       }else{
  //         System.out.print(" ");

  //       }
  //   }
  //   System.out.println(" ");
  // }

  
  // // for Hollow Triangle

  //   for(int i=1; i<=n; i++){
  //     for(int j=1; j<=n; j++){
  //       if(j==1 || i==n || j==i){
  //         System.out.print("*");
  //       }else{
  //         System.out.print(" ");

  //       }
  //   }
  //   System.out.println(" ");
  // }

  // // for diamond shape 
  // for(int i=1; i<=2*n-1; i++){
  //   for(int j=1; j<=2*n-1; j++){
  //     if(((i<=n) && (j > (n-i)) && (j<(n+i))) ||
  //      ((i>n ) && j> n-(2*n-i) && j< n+(2*n-i) )){
  //       System.out.print("*");
  //     }else{
  //       System.out.print(" ");
  //     }
  //   }
  //    System.out.println(" ");
  // }
  

  // //  hollow pyramid
  // for(int i=0; i<n; i++){
  //   for(int j=0; j<2*n-1; j++){
  //    if(j==n-1-i || j==n-1+i || i ==n-1){
  //       System.out.print("*");
  //    }else {
  //     System.out.print(" ");
  //    }
  //   }
  //   System.out.println(" ");
  // }

  // // for butterfly pattern
  // for(int i =1; i<=2*n; i++){
  //   for(int j=1; j<=2*n; j++){
  //     if((i<=n && j>i && j<=2*n-i) || (i>n && j>2*n-i+1 && j<i)){
  //       System.out.print(" ");
  //     }else{
  //       System.out.print("*");
  //     }
  //   }
  //   System.out.println(" ");
  // }


  // //number diamond
  // for(int i =1; i<=2*n; i++){
  //   for(int j=1; j<=2*n; j++){
  //     if((i<=n && j>n-i && j<2*n-(n-i)) ){
  //       if(i<=n){
  //         for(int k=1; k<=2*i-1; k++){
  //           System.out.print(k);
  //         }break;
  //       }
  //     }if( (i>n && j>i-n && j<2*n-(i-n))){
  //         for(int k=1; k<= 2*(2*n-i)-1; k++){
  //             System.out.print(k);
  //         }break;
  //       }
  //     else{
  //       System.out.print(" ");
  //     }
  //   }
  //   System.out.println(" ");
  // }




for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= i; j++)
        System.out.print(j);

    for (int j = i - 1; j >= 1; j--)
        System.out.print(j);

    System.out.println();
}


  }
}
