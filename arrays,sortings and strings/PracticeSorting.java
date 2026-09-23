public class PracticeSorting {

  public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
      int current = i;
      int prev = i-1;
      int temp = arr[current];
      while(prev>=0 && arr[prev] > temp){
          arr[prev+1] = arr[prev];
          prev --;
      }
      prev++;
      arr[prev] = temp;
    }
  }
  public static void  main(String args[] ){
     int arr[] = {5,4,1,3,2};
     insertionSort(arr);
     for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
     }
  }
}
