package ArraysAndArrayLists;

// import java.util.*;
//
// public class RotateArrayByKSteps {
//
//     public static void printArray(int[] arr){
//         for(int ele : arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
//
//     public static void inputArray(int[] arr,int n){
//         Scanner sc = new Scanner(System.in);
//         for(int i=0 ; i < arr.length ; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println();
//         sc.close();
//     }
//
//    public static void reverseArray(int[] arr, int low, int high){
//        while(low <= high){
//            int temp = arr[low];
//            arr[low] = arr[high];
//            arr[high] = temp;
//            low++; high--;
//        }
//    }
//
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter steps of rotation : ");
//         int k = sc.nextInt();
//         System.out.print("Enter size of Array : ");
//         int n = sc.nextInt();
//         k = k%n;
//         int[] arr = new int[n];
//
//         inputArray(arr, n);
//         System.out.print("Actual Array : ");
//         printArray(arr);
//         reverseArray(arr, 0, n-k-1);
//         reverseArray(arr, n-k, n-1);
//         reverseArray(arr, 0, n-1);
//         System.out.print("Rotated Array by effective "+k+" steps : ");
//         printArray(arr);
//         sc.close();
//     }
// }


    // Using an extra array [M2]

import java.util.*;

public class RotateArrayByKSteps {

    public static void inputArray(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
    }

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter steps of rotation : ");
        int k = sc.nextInt();
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        k = k%n;
        int[] arr = new int[n];

        inputArray(arr, n);
        System.out.print("Actual Array : ");
        printArray(arr);

        int[] nums = new int[n];

        int t=0;
        for(int i=0;i<n;i++){
            if(i<k) nums[i]=arr[n-k+i];
            else{
                nums[i]=arr[t];
                t++;
            }
        }

        System.out.print("Rotated Array by effective "+k+" steps : ");
        printArray(nums);
        sc.close();
    }
}



