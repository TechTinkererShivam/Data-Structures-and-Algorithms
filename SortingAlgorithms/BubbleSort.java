package SortingAlgorithms;

public class BubbleSort {

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
        // //Check an array is sorted or not,
        // int[] arr = {1,4,7,18,18,32,55,98};
        // int status = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i]>=status){
        //         status=arr[i];
        //     }
        //     else{
        //         System.out.println("Array is not sorted");
        //         return;
        //     }
        // }
        // System.out.println("Array is sorted");


        // Bubble Sort
        /*
            Bubble sort gets its name from the way smaller elements "bubble" to the top 
            of the list while larger elements "sink" to the bottom. In each pass through 
            the list, adjacent elements are compared and swapped if they are in the wrong order. 
            This process resembles bubbles rising to the surface in a liquid, hence the name "bubble sort."
            
        */

        int[] arr = {3,2,1,5,4};
        int n = arr.length;
        System.out.print("Actual Array: ");
        printArray(arr);

        // // code of bubble sort algo I
        // for(int i=0;i<n-1;i++){ // passes : if size = n then max passes = n-1
        //     for(int j=0;j<n-1;j++){ 
        //         if(arr[j]>arr[j+1]) swap(arr,j,j+1); // swapping two adjacent elements
        //     }
        // }
        // // No. of Operations = (n-1)^2
        // // TC = O(n^2)
        // // AS = O(1)
        // System.out.print("Sorted Array: ");
        // printArray(arr);


        // // Observation : In each pass largest elements is at its correct positions
        // // code of bubble sort algo II
        // for(int i=0;i<n-1;i++){ // passes : if size = n then max passes = n-1
        //     for(int j=0;j<n-1-i;j++){ 
        //         if(arr[j]>arr[j+1]) swap(arr,j,j+1); // swapping two adjacent elements
        //     }
        // }
        // // No. of Operations = (n(n-1))/2
        // // TC = O(n^2)
        // // AS = O(1)
        // System.out.print("Sorted Array: ");
        // printArray(arr); 


        // Checking array is sorted or not after each pass
        // code of bubble sort algo III (optimised code)
        for(int i=0;i<n-1;i++){ // passes : if size = n then max passes = n-1
            boolean flag = true; // assuming array is sorted 
            for(int j=0;j<n-1-i;j++){ 
                if(arr[j]>arr[j+1]){  
                    swap(arr,j,j+1); // swapping two adjacent elements
                    flag = false; 
                }
            }
            if(flag==true) break;
        }
        // No. of Operations = (n(n-1))/2 in worst case
        // TC = O(n^2) in worst case
        // AS = O(1)
        System.out.print("Sorted Array: ");
        printArray(arr);
        
        // Bubble sort is a stable sorting technique
        /*
         * In Bubble Sort Algo
         * Max passes = n-1
         * Max swaps = sum from [1 to n-1]
         *              --- where n is the size of array
         */
    }
}


/*
 *          Stable Sorting vs Unstable Sorting
 *         ------------------------------------
 *              arr={3,1,5,3*,4}
 *  Stable Sort : If relative order is maintained i.e., {1,3,3*,4,5}
 *  Unstable Sort : If relative order is not maintained i.e., {1,3*,3,4,5}
 *
 */
