package SortingAlgorithms;

public class MajorityElement {

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
        int[] arr = {4,1,4,3,4,0,4,7,4,4,5,4};
        int n = arr.length;
        System.out.print("Actual Array: ");
        printArray(arr);

        // sorting using insertion sort
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]) swap(arr, j, j-1);
                else break;
            }
        }

        System.out.print("Sorted Array:");
        printArray(arr);

        System.out.print("Majority Element : "+arr[n/2]);
        



    }
}
