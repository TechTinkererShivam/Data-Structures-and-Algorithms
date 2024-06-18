package SortingAlgorithms;

import java.util.*;

public class SelectionSort {  // Unstable sorting algo

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,-1};
        int n = arr.length;
        System.out.print("Actual Array: ");
        printArray(arr);

        // code of selection sort
        for(int i=0;i<n-1;i++){ // passes = (n-1)
            int mn = Integer.MAX_VALUE;
            int index = -1;
            for(int j=i;j<n;j++){ //finding min in each pass
                if(arr[j]<mn){
                    mn = arr[j];
                    index = j;
                }
            }
            swap(arr, i, index); 
        }

        System.out.print("Sorted Array : ");
        printArray(arr);

    }
}

/*
 *  No. of Operations = (n*(n+1))/2
 *  TC = O(n^2)
 *  AS = O(1)
 */ 


/*
 *      Selection Sort                            Bubble Sort
 *      --------------                            -----------          
 *             
 *   1) Can't be optimised                     Can be optimised            
 *                                      
 *   2) Unstable Sort                          Stable Sort       
 *                                     
 *   3) No of swaps are less                   No of swaps are more                
 *         (n-1) swaps                          (n*(n-1))/2 swaps
 *                                      
 *                                      
 *   4)      TC                                           TC
 *     Best Case : O(n^2)                            Best Case : (n)
 *     Average Case : O(n^2)                         Average Case : O(n^2)
 *     Worst Case : O(n^2)                           Worst Case : O(n^2)            
 * 
 *   5)  SC : O(n)                                 SC : O(n)
 *       AS : O(1)                                 AS : O(1) 
 * 
 */
