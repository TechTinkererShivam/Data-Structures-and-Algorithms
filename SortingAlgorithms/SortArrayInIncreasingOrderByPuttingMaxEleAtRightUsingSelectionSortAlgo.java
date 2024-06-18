package SortingAlgorithms;

public class SortArrayInIncreasingOrderByPuttingMaxEleAtRightUsingSelectionSortAlgo {
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


        int x = n-1;
        for(int i=0;i<n-1;i++){ // passes = n-1
            int mx = Integer.MIN_VALUE;
            int index = -1;
            for(int j=0;j<n-i;j++){
                if(arr[j]>mx){
                    mx=arr[j]; // selecting max ele
                    index=j;
                }
            }
            swap(arr,x,index); // largest ele at right of the array
            x--;
        }

        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}
