package ArraysAndArrayLists;

// import java.util.*;

// public class RotateArrayByKSteps {
    
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

//     public static void reverseArray(int[] arr, int x, int y){
//         int i=x , j=y;
//         while(i < j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter steps of rotation : ");
//         int k = sc.nextInt();
//         System.out.print("Enter size of Array : ");
//         int n = sc.nextInt();
//         k = k%n;
//         int[] arr = new int[n];

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

        int i=0;
        while(i<k){
            nums[i] = arr[n-k+i];
            i++;
        }

        int j=0;
        while(j<n-k){
            nums[i] = arr[j];
            i++; j++;
        }

        System.out.print("Rotated Array by effective "+k+" steps : ");
        printArray(nums);
        sc.close();
    }
}



