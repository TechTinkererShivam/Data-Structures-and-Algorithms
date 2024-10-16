package ArraysAndArrayLists;

import java.util.*;

public class SortArrayOf0sand1s {

    public static void inputArray(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array's elements : ");
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

        //      //Using built-in function [M1]
        // Arrays.sort(arr);

        //        //  Two pass solution [M2]
        // int noz = 0; // noz = no. of zeroes
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == 0) noz++;
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     if(i<noz) arr[i]=0;
        //     else arr[i]=1;
        // }
        
        // System.out.print("Sorted Array : ");
        // printArray(arr);

        // Single pass solution [M3]
        int low=0 , high=n-1;

        while(low <= high){
            if(arr[low]==0) low++;
            else if(arr[high]==1) high--;
            else{
                swap(arr,low,high);
                low++;high--;
            }
        }
        System.out.print("Sorted Array : ");
        printArray(arr);

        sc.close();
    }
}
