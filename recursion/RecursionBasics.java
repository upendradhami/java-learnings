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


  public static int firstOccur(int arr[] , int key , int i){
     if (i == arr.length-1 ) return -1;
     if(arr[i] == key) {
      return i ;
     }

     return firstOccur(arr, key, i+1);
  }

  public static  int lastOccur(int arr[], int key, int i ){
    if(i ==arr.length-1) return -1;
    int isFound = lastOccur(arr, key, i+1);

    if(isFound != -1){
      return isFound;
    }


    if(arr[i] == key){
      return i;
    }


    return isFound;
   
    
  }



  // solving tiling problem 
  public static int tilingProblem(int n){
    if(n == 0 || n== 1){
      return 1;
    }
  // calculate verical choice 
   int ch1v = tilingProblem(n-1);

   // calculate horizontal choice
    int ch2h = tilingProblem(n-2);


    int totalways = ch1v+ch2h;
    return totalways;
  }


  public static void removeDuplicate(String str,int i,boolean arr[],StringBuilder sb ){
    if(i== str.length()-1){
      System.out.println(sb);
      return ;
    }

    if((arr[str.charAt(i) - 'a'] == true)){
      removeDuplicate(str, i+1, arr, sb);
    }else{
      arr[str.charAt(i) - 'a'] = true;
      removeDuplicate(str, i+1, arr, sb.append(str.charAt(i)));
    }

  }



  public static void printSequence(int n,String str,int lastPlace){
    if(n == 0 ) {
      System.out.println(str);
      return;
    }

    if(lastPlace == 0){
       printSequence(n-1, str+'0', 0);
       printSequence(n-1,str+'1', 1);
    }else{
       printSequence(n-1, str+'0', 0);
    }
  }


  public static void main(String[] args) {
    // printIncr(10);
    // System.out.println(factorial(5));
    // System.out.println(sumNatural(10));
    //   // System.out.println(fibo(6));

    //   int arr[] = {2,4,2,5,6,3,2,5,2};

    // System.out.println(lastOccur(arr, 5, 0));
    // String str = "appnaCollege";
    // boolean arr[] = new boolean[27];
    // StringBuilder sb = new StringBuilder();

    // removeDuplicate(str.toLowerCase(), 0, arr, sb);

    printSequence(2,new String(""), 0);

  }
}
