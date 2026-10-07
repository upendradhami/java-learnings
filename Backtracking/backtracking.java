package Backtracking;

public class backtracking {

  public static void arrBack(int[] arr, int i) {
    if (i == arr.length) {
      printArr(arr, 0);
      return;
    }

    arr[i] = i + 1;
    arrBack(arr, i + 1);
    arr[i] = arr[i] - 2;

  }

  public static void printArr(int[] arr, int i) {
    if (i == arr.length)
      return;
    System.out.print(arr[i] + " ");
    printArr(arr, i + 1);
  }

  // printing all available substring of the array ,
  // ie. if 'abc ' is the string then the output will be a,ab,abc,b,bc,c
  public static void printSubstring(String str, String str1, int i) {
    if (i == str.length()) {
      System.out.println(str1);
      return;
    }

    printSubstring(str, str1 + str.charAt(i), i + 1);
    printSubstring(str, str1, i + 1);

  }

  public static void permutaions(String str, String str1) {
    if (str.length() == 0) {
      System.out.println(str1);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      String newStr = str.substring(0, i) + str.substring(i + 1);
      permutaions(newStr, str1 + str.charAt(i));
    }
  }

  // N-Queens Problem
  public static void NQueen(char ch[][], int row) {
    if(row == ch.length){
      System.out.println("---------------chess board -------------------");
      printboard(ch); i++;
      return;
    }
    
    for(int j=0; j<ch.length; j++){
      //finding the possible target places where Q can be attacked 
      if(isAttacked(ch,row,j)){

         // printing all possible ways of putting the queen in the chess board 
      ch[row][j] = 'Q';
      NQueen(ch,row+1);
      ch[row][j] = 'X';
      }
     
    }
  }

  //creating a function that checks queen is being attacked or not 
  public  static boolean isAttacked(char ch[][],int row,int col){
    // vertical tracing 
     for(int i=row-1; i>=0; i--){
      if(ch[i][col] == 'Q')  return false;
     }
      

    // left diagonal tracing 
    for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){
       if(ch[i][j] == 'Q')  return false;
    }

    //right diagonal tracing
    for(int i=row-1,j=col+1; i>=0 && j<ch.length; i--,j++){
       if(ch[i][j] == 'Q')  return false;
    }

    return true;
  }

  /// printing chess board 
  public static void printboard(char ch[][]){
    for(int i=0; i<ch.length; i++){
      for(int j=0; j<ch.length; j++){
         System.out.print(ch[i][j] + " ");
      }
      System.out.println("");
    }
  }

  static int i=0; 
  public static void main(String args[]) {
    int n=5;
    char ch[][] = new char[n][n];

    /// initializing the chess board 
    for(int i=0; i<ch.length; i++){
      for(int j=0; j<ch.length; j++){
         ch[i][j] = 'x';
      }
    }

    NQueen(ch, 0);
    System.out.println("total possible ways are : " + i);
  }
}

// for printArr backtracking concepts
// int arr[] = new int[5];
// arrBack(arr,0);
// printArr(arr,0);

// for Permutation question

// // printSubstring("abc", new String(), 0);
// permutaions("abc","");