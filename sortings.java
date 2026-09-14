

public class sortings {

  public static void bubbleSort(int[] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length-1-i; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }


  public static void selectionSort(int[] arr){
    int n = arr.length;
    for(int i=0; i<n-1; i++){
      int minIndex = i;
      for(int j=i; j<n;  j++){
        if(arr[j] < arr[minIndex]) {
          minIndex =j;
        }
      }
     // swap minIndex value and arr[i]
       int temp = arr[minIndex];
       arr[minIndex] = arr[i];
       arr[i] = temp;
    }
  }

  public  static void printArr(int[] arr) {
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i] + " ");
    }
  }
  public static void main(String args[]){
    int[] arr = {5,2,3,4,1};
    // bubbleSort(arr);

    selectionSort(arr);
    printArr(arr);

  }  
}
