import java.util.*;

public class ArrayssPrac {

  // public static boolean findSimilar(int arr[]) {
  //   for (int i = 0; i < n; i++) {
  //     for (int j = i + 1; j < n; j++) {
  //       if (arr[i] == arr[j]) {
  //         return true;
  //       }
  //     }
  //   }

  //   return false;
  // }

  // Trapped water 
  public  static void trapWater(int arr[]){
    int n= arr.length;
    int lMax[] =new int[n];
    int rMax[] =new int[n];
    // calulater left max;
    lMax[0] = arr[0];
    for(int i=1; i<n; i++){
      lMax[i] = Math.max(lMax[i-1], arr[i]);
    }

    // calculate right max
    rMax[n-1] = arr[n-1];
    for(int i=n-2; i>=0; i--){
      rMax[i] = Math.max(rMax[i+1], arr[i]);
    }

    //loop 
    int traped_water =0;
    for(int i=0; i<n; i++){
      //calculate waterlevel 
      int waterlevel = Math.min(lMax[i],rMax[i]);
      int occupied = (waterlevel-arr[i]);
      
      traped_water = traped_water + occupied;
    }

   System.out.println("trapped water is : "+ traped_water);
  }

  public static int findRotatedIndex(int arr[], int target) {
    int n= arr.length;
    int left = 0;
    int right = n - 1;

    while (left <= right) {
      int mid = left + (right - left );

      if (arr[mid] == target)
        return mid;
      if (arr[left] <= arr[mid]) {
        if (arr[left] < target && arr[mid] > target) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (arr[right] > target && arr[mid] < target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }

    }
   
    return -1;
  }

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();

    // int arr[] = new int[size];
    // for(int i=0; i<size; i++){
    // int new_val = sc.nextInt();
    // arr[i] = new_val;
    // }

    // System.out.println("Enter your target element : ");
    // int target = sc.nextInt();
    // // System.out.println(findSimilar(arr));

     int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};  //  4, 5, 6, 7, 0, 1, 2 
    // int target = 0;
    // System.out.println(findRotatedIndex(arr, target));

    trapWater(arr);


  }
}
