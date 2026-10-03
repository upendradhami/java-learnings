public class RecursionQuestion {

  public static void printIndex(int arr[], int key, int i) {
    if (i == arr.length - 1) {
      return;
    }

    if (arr[i] == key)
      System.out.println(i);
    printIndex(arr, key, i + 1);
  }

  public static void returnString(int n, String str, String arr[]) {
    if (n == 0) {
      System.out.println(str);
      return;
    }

    int r = n % 10;
    n = n / 10;

    str = arr[r] + " " + str;
    returnString(n, str, arr);
  }

  public static int findlenth(String str, int i) {

    if (str.charAt(i) == '\0')
      return i;

    i++;
    findlenth(str, i);

    return i;

  }

  public static void mergeSort(int[] nums, int si, int ei) {
    if (si >= ei)
      return;

    int mid = si + (ei - si) / 2;
    mergeSort(nums, si, mid);
    mergeSort(nums, mid + 1, ei);

    merge(nums, si, mid, ei);
  }

  public static void merge(int nums[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ei) {
      // Changed '<' to '<=' to maintain sorting stability
      if (nums[i] <= nums[j]) {
        temp[k] = nums[i];
        i++;
      } else {
        temp[k] = nums[j];
        j++;
      }
      k++;
    }

    while (i <= mid) {
      temp[k++] = nums[i++];
    }

    while (j <= ei) {
      temp[k++] = nums[j++];
    }

    for (k = 0, i = si; k < temp.length; k++, i++) {
      nums[i] = temp[k];
    }
  }

  public static void QuickSort(int arr[], int si, int ei) {
    if (si >= ei)
      return;

    // Partitioning of array
    int pivIn = partition(arr, si, ei);

    QuickSort(arr, si, pivIn - 1);
    QuickSort(arr, pivIn + 1, ei);
  }

  public static int partition(int arr[], int si, int ei) {
    int i = si - 1; // FIX 3: Start relative to the subarray index, not -1
    int pivot = arr[ei];

    // FIX 1 & 2: Loop only within the subarray, and compare array values instead of
    // indices
    for (int j = si; j < ei; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }

    // Place the pivot in its correct position
    i++;
    int temp = arr[ei]; // FIX 4: Use arr[ei] instead of the local variable 'pivot'
    arr[ei] = arr[i];
    arr[i] = temp;

    return i;
  }

  public static int findInRotatedArray(int arr[], int key, int si, int ei) {
    if (si > ei)
      return -1;

    int mid = si + (ei - si) / 2;
    if (arr[mid] == key)
      return mid;

    if (arr[si] <= arr[mid]) { // traverse left side of the array

      if (arr[mid] >= key && key >= arr[si]) { // check whether it is inside the first half of left part or not
        return findInRotatedArray(arr, key, si, mid - 1);
      } else {
        return findInRotatedArray(arr, key, mid + 1, ei);
      }

    } else { // traverse right side of the array
      if (arr[mid] <= key && key <= arr[ei]) { // check whether it is inside the first half of the right part or not
        return findInRotatedArray(arr, key, mid + 1, ei);
      } else {
        return findInRotatedArray(arr, key, si, mid - 1);
      }

    }

  }

  /*
   * Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all
   * the characters in
   * all the Strings are in lowercase). (EASY)
   * Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
   * Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"}
   */

  public static void stringSort(String arr[], int si, int ei) {
    if (si >= ei)
      return;

    int mid = si + (ei - si) / 2;
    stringSort(arr, si, mid); // leftpart
    stringSort(arr, mid + 1, ei); // rightpart

    mergingString(arr, si, mid, ei);

  }

  public static void mergingString(String arr[], int si, int mid, int ei) {
    String[] temp = new String[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ei) {
      if ((arr[i].compareToIgnoreCase(arr[j])) <= 0) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }

  }

  /*
   * Question 2 : Given an array nums of size n, return the majority element.
   * (MEDIUM)
   * The majority element is the element that appears more than ⌊n / 2⌋ times. You
   * may assume
   * that the majority element always exists in the array.
   * Sample Input 1 : nums = [3,2,3]
   * Sample Output 1 : 3
   * Sample Input 2 : nums = [2,2,1,1,1,2,2]
   * Sample Output 2 : 2
   * Constraints (extra Conditions):
   * ● n == nums.length
   * ● 1 <= n <= 5 * 104
   * ● -109 <= nums[i] <= 109
   */
  public static void main(String args[]) {

    int arr[]= {2,2,1,1,1,3,1,3,5,3,2,3,3,6,7,3,3,8,2};
    System.out.println(majorityElement(arr));
  }
}

// int arr[] = {1,3,5,2,5,8,9,5,4};
// // printIndex(arr, 5, 0);

// // String arr1[] =
// // {"zero","one","two","three","four","five","six","seven","eight","nine"};
// // returnString(1240,new String(), arr1);

// // System.out.println(findlenth("abcde fghh 2lo", 0));

// // int arr[] = { 6, 3, 9, 8, 2, 5 };
// // QuickSort(arr, 0, arr.length - 1);

// int arr1[] = { 3, 4, 5, 6, 0, 1, 2 };

// for (int i = 0; i < arr1.length; i++) {
// System.out.println(findInRotatedArray(arr1, i, 0, arr1.length - 1));
// }

// // for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i] + " ");
// // }

// int newArr[] = { 4,2,6,1};
// mergeSort(newArr, 0, newArr.length-1 );
// for (int i = 0; i < newArr.length ; i++) {
// System.out.print(newArr[i] + " ");
// }

// question no 1
// String[] arr = { "sun", "earth", "mars", "mercury" };

// stringSort(arr, 0, arr.length - 1);

// for (int i = 0; i <arr.length; i++) {
// System.out.print(arr[i] + " ");
// }




  // brute force approach for 2nd question
  // public static int majorityElement(int arr[]) {
  //   int k = 0;
  //   int[] newArr = new int[arr.length];

  //   for (int i = 0; i < arr.length; i++) {
  //     int c = 0;
  //     for (int j = i; j < arr.length; j++) {
  //       if (arr[i] == arr[j]) {

  //         newArr[k] = c++;
  //       }
  //     }
  //      k++;
  //   }

  //   int maxval = newArr[0];
  //   int max = 0;
  //   for(int i=0; i<newArr.length; i++){
  //      if(newArr[i] >= maxval){
  //       maxval = newArr[i];
  //       max = arr[i];
  //      }
       
  //   }


  //   return max;

  // }
