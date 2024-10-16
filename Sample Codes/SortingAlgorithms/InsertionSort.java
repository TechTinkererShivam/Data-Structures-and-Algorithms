package SortingAlgorithms;

public class InsertionSort { // stable sorting algo

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
        int[] arr = {3,12,17,-5,4,-1};
        int n = arr.length;
        System.out.print("Actual Array: ");
        printArray(arr);

        // // selection sort code : [sorted part | unsorted part]
        // for(int i=1;i<n;i++){ //passes
        //     for(int j=i;j>0;j--){   // swapping only with sorted part
        //         if(arr[j]<arr[j-1]) swap(arr, j,j-1); 
        //         else break;
        //     }
        // }

                // Using while loop
        // selection sort code : [sorted part | unsorted part]
        for(int i=1;i<n;i++){ //passes = n-1
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j,j-1);
                j--;
            }
        }

        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}

/*          
 *          TC
 *         ----
 *   Best Case : O(n)
 *   Average Case : O(n^2)
 *   Worst Case : O(n^2) 
 * 
*/



/*
 *                      Bubble Sort                   Selection Sort                     Insertion Sort
 * 
 * 1) Best Case TC        O(n)                         O(n^2)                               O(n)
 * 
 * 2) S/US               Stable                        Unstable                            Stable
 * 
 * 3) Max swaps         (n*(n-1))/2                      n-1                              (n*(n-1))/2  
 * 
 * 4) Optimisation      Using an extra                Can't be optimised                  Always Optimised
 *                      boolean variable.
 * 
 * 
 * 
 * 5) Average & Worst      O(n^2)                             O(n^2)                      O(n^2) 
 *       Case TC
 * 
 * 
 */
