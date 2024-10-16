package ArraysAndArrayLists;

import java.util.*;

public class MinElementInArray {

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

        int mn=arr[0];

        // min element in the array(M1)
        for(int i=1 ; i < arr.length ; i++){
            if(arr[i] < mn) mn = arr[i];
        }
        System.out.println("Min element in the Array : "+mn);

        // // min element in the array(M2)
        // int mn = Integer.MAX_VALUE;
        // for(int i=0 ; i < arr.length ; i++){
        //     if(arr[i] < mn) mn = arr[i];
        // }
        // System.out.println("Min element in the Array : "+mn);

        // // min element in the array(M3)
        // int mn=Integer.MAX_VALUE;
        // for(int i=0 ; i < arr.length ; i++){
        //     mn = Math.min(arr[i], mn);
        // }
        // System.out.println("Min element in the Array : "+mn);


         // sec min element in the array [double pass solution : used loop 2 times]
         int mn2 = arr[0];
         for(int i=1 ; i < arr.length ; i++){
             if((arr[i] < mn2) && (arr[i] != mn)) mn2 = arr[i];
         }
         System.out.println("sec. min element in the Array : "+mn2);

        sc.close();

        // sec min element in the array [single pass solution : used loop only 1 time]


    }
}
