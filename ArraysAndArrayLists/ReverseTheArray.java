package ArraysAndArrayLists;

import java.util.*;

public class ReverseTheArray {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void inputArray(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        inputArray(arr, n);
        System.out.print("Actual Array : ");
        printArray(arr);
        sc.close();

        //Code to reverse an array using two pointers approach
        int i=0 , j=arr.length-1;
        while(i < j){
            swap(arr, i, j);
            i++; 
            j--;
        }

        System.out.print("Reversed Array : ");
        printArray(arr);

    }
}


// import java.util.*;

// public class ReverseTheArray {

//     public static void printArray(int[] arr){
//         for(int ele : arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }

//     public static void inputArray(int[] arr,int n){
//         Scanner sc = new Scanner(System.in);
//         for(int i=0 ; i < arr.length ; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println();
//         sc.close();
//     }

    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         inputArray(arr, n);
//         System.out.print("Actual Array : ");
//         printArray(arr);
//         sc.close();

//         //Code to reverse an array using an extra array
//         int[] nums = new int[arr.length];
//         for(int i = 0 ; i < arr.length ; i++){
//             nums[i] = arr[arr.length-1-i];
//         }

//         System.out.print("Reversed Array : ");
//         printArray(nums);

//     }
// }