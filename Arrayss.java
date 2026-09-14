import java.util.*;

public class Arrayss{

  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
  }


  public static int findLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++){
      if(largest < numbers[i]){
        largest = numbers[i];
      }
    }
       return largest;
  }


  public static int findNum(int numbers[], int key){ // using linear search

    for(int i=0; i<numbers.length; i++){
      if(numbers[i] == key) return i;
    }
     
     return -1;
  }

  

  public static void reverse(int numbers[]){
    int start=0; 
    int end = numbers.length -1;
    while(start < end){

      int temp=numbers[end];
      numbers[end] = numbers[start];
      numbers[start] = temp;

      start = start+1;
      end = end -1;
    }
  }


  public static int binSearch(int numbers[], int key){
    int start =0;
    int end = numbers.length -1;

    while(start <= end){
      int mid = (start+end)/2;

      if(numbers[mid] == key) {return mid;}
      else if(numbers[mid] < key) {
        start = mid+1;
       
      }else{
        end = mid -1;
      }
    }

    return -1;

  }

  // print possible pairs 
  public static void pairPrint(int arr[]){
    for(int i=0; i<arr.length; i++){
      for(int j=i; j<arr.length; j++){
        System.out.printf("(%d ,%d) ",arr[i],arr[j]);
      }
      System.out.println(" ");
    }
  }

  // print sub arrays 
  public static int maxsum_SubArrays(int arr[]){
    int max_sum=0,obt_sum =0;
    for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
         int sum =0;
        for(int k=i; k<=j; k++ ){
           System.out.printf("%d ",arr[k]);
           sum = sum +arr[k];
          obt_sum = sum;
        }
          System.out.println("sum of above pair is " + sum);
        if(max_sum <= obt_sum){
          max_sum = obt_sum;
        }
        System.out.println(" ");
      }
      System.out.println(" ");
    }

    return max_sum;
  }


  // prefix sum method for finding max sum of subarrays 
  public static void max_sum_prefix_mtd(int arr[]){
    int cur_sum=0,maxSum = Integer.MIN_VALUE;

    // calculate prefix array i.e sum of arr upto i number i.e if arr=[1,2,4]  sum or prefix array  = [1,3,7]
    int[] prefix =new int [arr.length];
    prefix[0] = arr[0];
    for(int i=1; i<arr.length; i++){
      prefix[i] = prefix[i-1]+ arr[i];
    }


    for(int i=0; i<arr.length; i++){
       cur_sum=0; int start=i;
       for(int j=i; j<arr.length; j++){
        int end=j;
        cur_sum = start ==0  ? prefix[end] : (prefix[end] - prefix[start-1]);
       
        if(maxSum < cur_sum){
          maxSum = cur_sum;
        }
       }
        System.out.println("The current sum is : " + cur_sum);
       System.err.println(" the maximum sum is : " + maxSum);
    }
  }


 // kadane's algorithm 
  public static void kadane(int arr[]){
    int  cur_sum =0, max_sum = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
       
       cur_sum = cur_sum+ arr[i];
       if(cur_sum<=0){
        cur_sum =0;
       }

       max_sum = Math.max(max_sum, cur_sum);
    }
    System.out.println("Maximum sum of the array is : "+ max_sum);
  }


  // raining trapped water problem ;
     public static void trappedWater(int arr[]){
      int trapped_water=0;
      int n = arr.length-1;
      int L_max[]= new int[n];
      int R_max[]= new int[n];
      int waterLevel[]= new int[n];


      //calulate left max height
      L_max[0] = arr[0];
      for(int i=1; i<n; i++){
        L_max[i] = Math.max(L_max[i-1], arr[i]);
      }
      //calculate right max height
      R_max[n-1]=arr[n-1];
      for(int i=n-2; n>=0; i--){
        R_max[i] = Math.max(R_max[i+1], arr[i]);
      }
      //loop 
      for(int i=0; i<n; i++){
        //find min heigh i.e. from left max and right max
         waterLevel[i] = Math.min(L_max[i],R_max[i]);
       //calculate trapped water
         trapped_water =trapped_water+(waterLevel[i]-arr[i])*1;

      }
      System.out.println("Total water collected is: "+trapped_water);
     
     }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // int num_arr[] = new int[20];
    // num_arr[0] = 345;
    // int len = num_arr.length;
    // System.out.println(num_arr[0]+len);


  //   int numbers[]= {1,2,6,4};
  //   // System.out.println("largest number is : "+ findLargest(numbers));
  //   // int index = findNum(numbers, 7);
  //   // System.out.println("last number is : "+ numbers.length);

  //   // int key = 21;
  //   // int index = binSearch(numbers,key);
  //   // if(index == -1){
  //   //   System.out.print("number not found");
  //   // }else{
  //   //   System.out.println("number found at index: "+index);
  //   // }

  //   // System.out.println("array before reverse: ");
  //   // printArr(numbers);
  //   // reverse(numbers);
  //   // System.out.println("\n array after reversing: ");
  //   // printArr(numbers);

  //   // pairPrint(numbers);
  //   // int maxsum = maxsum_SubArrays(numbers);
  //   // System.out.println("maximum sum is obtained as : "+ maxsum);

  //   int[] arr = {1,-2,6,-1,3};
  //   // max_sum_prefix_mtd(arr);
    
  //   // kadane(arr);
  // // int arr2[] ={-2,-3,4,-1,-2,1,5,-3};
  // //   kadane(arr2);

    int arr3[] ={4,2,0,6,2,3,5};
    trappedWater(arr3);



  }
}