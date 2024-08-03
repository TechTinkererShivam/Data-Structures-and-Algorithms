package ArraysAndArrayLists;

import java.util.*;

public class Imp_SortArrayOf0s1sand2s {

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

    public static void swapArray(int[] arr, int i, int j){
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

        //     //  Two pass solution [M1]
        // int noz=0 , no1=0; // noz = no. of zeroes , no1 = no. of ones

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == 0) noz++;
        //     else if(arr[i] == 1) no1++;
        // }

        // for (int i = 0; i < n; i++) {
        //     if(i<noz) arr[i]=0;
        //     else if(i<(noz+no1)) arr[i]=1;
        //     else arr[i]=2;
        // }
        
        // System.out.print("Sorted Array : ");
        // printArray(arr);
        // sc.close();

        //  Single pass solution [M2 : Dutch's Flag Algorithm(VVI)]

        /*                              Pseudo Code
         * 
         * S1: Break Array into 4 parts (0 0 0 0)  ,    (1,1,1,1), (1,0,2,0,2,1),  (2,2,2,2,2)
         *                                    low-1     low  mid-1  mid      high   high+1  n-1
         * Before low -> arr[i]==0;
         * Before mid -> arr[i]==1;
         * After high -> arr[i]==2;
         */

        // Code of Dutch's Flag Algorithm 
        int low=0, mid=0, high=n-1;
        while(mid <= high){
            if(arr[mid]==0){
                swapArray(arr, low, mid);
                low++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else{ //arr[mid]==2
                swapArray(arr, mid, high);
                high--;
            }
        }
        System.out.print("Sorted Array : ");
        printArray(arr);
        sc.close();   
    }
}
