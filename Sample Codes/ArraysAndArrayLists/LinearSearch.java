package ArraysAndArrayLists;

import java.util.*;

public class LinearSearch {

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

        System.out.print("Enter search element x : ");
        int x = sc.nextInt();

        System.out.print("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputArray(arr, n);
        printArray(arr);


        // target element code
        boolean status = false;
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] == x){
                status = true;
                System.out.println(x+" found at index : "+i);
                break;
            }
        }

        if(status == false) System.out.println(x+" does not exist in the array");
        sc.close();
    }
}
