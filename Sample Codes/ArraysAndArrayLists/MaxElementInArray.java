package ArraysAndArrayLists;

/*
* min integer value : Integer.MIN_VALUE
* max integer value : Integer.MAX_VALUE
* Math.max(10,20) // 20
* Math.min(10,20) // 10
* 
*/

import java.util.*;

public class MaxElementInArray {

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

        System.out.print("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputArray(arr, n);
        printArray(arr);

        // max element in the Array (M1)
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max) max = arr[i];
        }

        // // max element in the Array (M2)
        // int max = Integer.MIN_VALUE; // -2147483648
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] > max) max = arr[i];
        // }

        // // max element in the Array (M3)
        // int max = Integer.MIN_VALUE; // -2147483648
        // System.out.println(max);
        // for(int i = 0 ; i < arr.length ; i++){
        //     max = Math.max(arr[i], max);
        // }

        System.out.println("The max element in the array : "+max);
        sc.close();
    }
}
