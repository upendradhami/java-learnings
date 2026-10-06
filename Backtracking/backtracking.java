package Backtracking;

public class backtracking {

  public static void arrBack(int[] arr, int i){
    if(i == arr.length){
      printArr(arr, 0);
      return ;
    }

    arr[i] =i+1;
    arrBack(arr, i+1);
    arr[i] = arr[i]-2;

  }

  public static void printArr(int [] arr,int i){
    if(i== arr.length ) return ;
    System.out.print(arr[i]+ " ");
    printArr(arr,i+1);
  }


  // printing all available substring of the array , 
  // ie. if  'abc ' is the string then the output will be a,ab,abc,b,bc,c
  public static void printSubstring(String str,String str1,int i){
    if(i == str.length()) {
      System.out.println(str1);
      return;
    }

    printSubstring(str, str1+str.charAt(i), i+1);
    printSubstring(str, str1, i+1);


  }

  public static void permutaions(String str,String str1){
    if(str.length() == 0){
        System.out.println(str1);
        return;
    }

    for(int i=0; i<str.length(); i++){
       String newStr = str.substring(0,i) + str.substring(i+1);
       permutaions(newStr, str1+str.charAt(i));
    }
  }
  public static void main(String args[]){
  
    // printSubstring("abc", new String(), 0);
    permutaions("abc","");
  }
}




// for printArr backtracking concepts 
//    int arr[] = new int[5];
    //  arrBack(arr,0);
    //  printArr(arr,0);