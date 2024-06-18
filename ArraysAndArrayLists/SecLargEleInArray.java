package ArraysAndArrayLists;

import java.util.*;

public class SecLargEleInArray {

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

        // sec larg ele in the array
        int mx1 = arr[0], mx2 =arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > mx1) mx1 = arr[i];
        }
        System.out.println("First max element : "+mx1);

        for(int i = 1 ; i < arr.length ; i++){
            if((arr[i] > mx2) && (arr[i] != mx1)) mx2 = arr[i];
        }
        System.out.println("Second max element : "+mx2);

        sc.close();
    }
}
