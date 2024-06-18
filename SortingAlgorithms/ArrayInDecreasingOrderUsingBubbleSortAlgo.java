package SortingAlgorithms;

public class ArrayInDecreasingOrderUsingBubbleSortAlgo {

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
        int[] arr = {3,2,1,-5,4,-1};
        int n = arr.length;
        System.out.print("Actual Array: ");
        printArray(arr);

        // code using bubble sort : after every pass 'k'th smallest ele 
        // is at its right place (to the right of the array).
        for(int i=0;i<n-1;i++){ // n-1 passes
            boolean flag = true; // assuming array is sorted
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr, j, j+1);
                    flag = false;
                } 
            }
            if(flag==true) break;
        }
        System.out.print("Sorted Array in decreasing order : ");
        printArray(arr);
    }
}
