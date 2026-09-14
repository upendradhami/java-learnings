public class twoDArrays {

  public static void printArr(int arr[][]){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
         System.out.print(arr[i][j]+ " ");
      }
      System.out.println();
    }
   
  }


  // Question no1. print count for number 7 
  public static void count7(int arr[][]){
    int count=0;
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j] == 7){
          count ++;
        }
      }
    }

    System.out.println("Total count of 7 is : "+ count);
  }


  // Qno. 2 print out the sum of the numbers in the second row of the "nums" array 
  public  static void printSum(int arr[][]){
    int sum =0; 
    System.out.println(" your array length is : "+ arr.length);
    for(int i=0; i<arr[0].length; i++){
        sum += arr[1][i];
    }
    System.out.println("total sum is : " + sum);
  }


  //Q3. find transpose of a matrix 
  public  static void findTranspose(int arr[][]){
    int arrRow = arr.length;
    int arrCol = arr[0].length;
    int transpose[][] = new int[arrCol][arrRow]; // row become col and vice versa

    for(int i=0 ; i<arrRow; i++){
      for(int j=0; j<arrCol; j++){
        transpose[j][i] = arr[i][j];
      }
    }

    printArr(transpose);
  }

  // Spiral matrix print 
  public  static void SpiralMatrix(int arr[][]){
    int SR = 0;
    int ER = arr.length-1;
    int SC = 0;
    int EC = arr[0].length-1;

    while( SR<= ER && SC <= EC){
     // top 
     for(int i=SC; i<=EC; i++){
       System.out.print(arr[SR][i] + " ");
     }

    // right 
      for(int j=SR+1; j<=ER; j++){
       System.out.print(arr[j][EC] + " ");
     } 

    // bottom 
       for(int i=EC-1; i>=SC; i--){
         if(SR == ER) break;
        System.out.print(arr[ER][i] + " ");
       }

    // left
       for( int i=ER-1; i>=SR+1; i--){
        if(SC == EC) break;
        System.out.print(arr[i][SC]+" ");
       }
   

       SR++;
       ER--;
       SC++;
       EC--;

    } 
  }

  public static void diagonalSum(int arr[][]){
      // only for n*n arraay
      int n = arr.length-1;
      System.out.println(n);
      if(arr.length != arr[0].length){
          return ;
      }

      int sum =0;

      // 0(n^2 time complexity)
      // for(int i=0; i<=n; i++){
      //   for(int j=0; j<=n; j++){
      //     if( i == j || i+j == n){
      //     sum += arr[i][j];
      //   }
      //   }
      // }

      // 0(n) time complexity
      for(int i=0; i<=n; i++){
          sum += arr[i][i];
          sum += arr[i][n-i];
      }
      if( (n%2 == 0 )){
        sum = sum - arr[n/2][n/2];
      }

      System.out.println(" your sum of diagonal's  is : "+ sum);
  }


  // search in 2d array 
    public  static  void searchEle(int arr[][], int key){
      int n = arr.length;
      System.out.println("n  "+n);

      // // linear search 0(n^2) time complexity
      // for(int i=0; i<n; i++){
      //   for(int j=0; j<n; j++){
      //     if(arr[i][j] == key){
      //       System.out.println("element " + key +" is found at : " + i +" " + j);
      //       break;
      //     }
      //   }
      // }

      // staircase search // starting from bottom left corner of the array only for n*n array
      int i=arr.length-1;
      int j=0;
      System.out.println(arr[i][j]);
      while(i > 0 && j <=arr[0].length-1){


        if(key > arr[i][j]){ 
          // move right
            j++;
        }


        if(key < arr[i][j]){
          // move top
        i--;
        }

         if(key == arr[i][j]){
           System.out.println("element " + key +" is found at : " + i +" " + j);
           return ;
        }
        
      }


    }
  public static void main(String arg[]){

  //   int arr[][] = {
  //     {1,7,5},
  //     {4,5,7},
  //     {7,5,7},
  //     {8,7,2}
  //   };

  //  count7(arr);

   int arr1[][] = {
    {1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16},
   };

//    int[][] matrix3x3 = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };

// int[][] identityMatrix = {
//     {1, 0, 0, 1},
//     {0, 1, 1, 0},
//     {0, 1, 1, 0},
//     {1, 0, 0, 1}
// };

  //  printSum(arr1);
  //  findTranspose(arr1);
  //  SpiralMatrix(arr1);
  // diagonalSum(identityMatrix);
  searchEle(arr1, 11);
  }
}
