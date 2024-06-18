package SortingAlgorithms;

public class PushZeroesToEnd {

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
        int[] arr = {1,6,-9,0,3,9,1,-4,0,4,1,0,-3};
        int n = arr.length;
        printArray(arr);
        int noOfZeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;
        }
        // code to push zeroes to the end of the array
        for(int i=0;i<noOfZeroes;i++){ // passes = noOfZeroes
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0) swap(arr,j,j+1);
            }
        }
        printArray(arr);
    }
}
