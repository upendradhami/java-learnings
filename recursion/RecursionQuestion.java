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
    
    if(str.charAt(i) == '\0') return i;

    i++;
     findlenth(str, i);

     return i;

  }

    public static void sortArray(int[] nums , int si, int ei) {
        if(si>=ei) return ;

        int mid =si+(ei-si)/2;

        sortArray(nums,si,mid);
        sortArray(nums,mid+1,ei);

        mergeSort(nums,si,mid,ei);
    }

    public static void mergeSort(int nums[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int k =0;

        while(i <= mid && j<= ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                j++;
            }


            while(i<=mid){
                temp[k++] = nums[i++];
            }

            while(j<=ei){
                 temp[k++] = nums[j++];
            }


            for( k=0, i=si; k<=temp.length-1; k++ , i++ ){
                nums[i] = temp[k];
            }
        }
    
    }



   public static void QuickSort(int arr[], int si, int ei) {
    if (si >= ei) return;

    // Partitioning of array 
    int pivIn = partition(arr, si, ei);

    QuickSort(arr, si, pivIn - 1);
    QuickSort(arr, pivIn + 1, ei);
}

public static int partition(int arr[], int si, int ei) {
    int i = si - 1;        // FIX 3: Start relative to the subarray index, not -1
    int pivot = arr[ei];
    
    // FIX 1 & 2: Loop only within the subarray, and compare array values instead of indices
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
    int temp = arr[ei];   // FIX 4: Use arr[ei] instead of the local variable 'pivot'
    arr[ei] = arr[i];
    arr[i] = temp;

    return i;
}




  public static  void main(String args[]){
    // int arr[] = {1,3,5,2,5,8,9,5,4};
    //  printIndex(arr, 5, 0);


    // String arr1[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    // returnString(1240,new String(), arr1);

    // System.out.println(findlenth("abcde fghh 2lo", 0));

    // int newArr[] = {1,3,5,6};
    // sortArray(newArr, 0, newArr.length-1);


    int arr[] = {6,3,9,8,2,5};
    QuickSort(arr, 0, arr.length-1);
    
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }

  }
}
