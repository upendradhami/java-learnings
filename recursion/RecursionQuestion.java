public class RecursionQuestion {
  
  public  static  void printIndex(int arr[],int key,int i){
    if(i == arr.length -1 ){
      return ;
    }

    if(arr[i] == key) System.out.println(i);
    printIndex(arr, key, i+1);
  }


  public static void returnString(int n,String str,String arr[]){
    if(n==0) {
      System.out.println(str);
      return;
    }

    int r = n%10;
    n = n/10;

    str = arr[r]+" " + str;
    returnString(n, str, arr);
  }


  public static int findlenth(String str,int i){
    
    if(str.charAt(i).)) return i;

    i++;
    return findlenth(str, i);


  }
  public static  void main(String args[]){
    // int arr[] = {1,3,5,2,5,8,9,5,4};
    //  printIndex(arr, 5, 0);


    // String arr1[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    // returnString(1240,new String(), arr1);

    System.out.println(findlenth("abcde fghh 2lo", 1));

  }
}
