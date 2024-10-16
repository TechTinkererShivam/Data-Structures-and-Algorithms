package ArraysAndArrayLists;

/*
 * Shallow Copy : arr and nums will refer to the same array.
 * Deep Copy : arr, brr, crr are 3 different arrays.
 */

import java.util.*;

public class Imp_CopyOfArray {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {10,50,40,20,30};
        printArray(arr);

        // int[] nums = arr; // Shallow Copy -> [arr and nums refer to the same array, no additional array will be created]
        // printArray(nums);

        // nums[4] = 60;
        // System.out.println(arr[4]); //60

        // Deep Copy -> [ Creation of new Array (M1)]
        int[] brr = Arrays.copyOf(arr,arr.length);
        printArray(brr);

        arr[4] = 60;
        printArray(arr);
        printArray(brr);

        // Deep Copy -> [ Creation of new Array (M2)]
        int[] crr = new int[arr.length];
        for(int i=0 ; i < crr.length ; i++){
            crr[i] = arr[i];
        }

        arr[0] = 100;
        printArray(arr);
        printArray(crr);
    }

}    