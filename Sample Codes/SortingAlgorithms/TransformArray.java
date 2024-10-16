package SortingAlgorithms;

import java.util.Arrays;

public class TransformArray {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {51,14,39,22,10};
        int n = arr.length;
        System.out.print("Actual Array: ");
        printArray(arr);

        int count = 0;
        for(int i=0;i<n;i++){ // 'n' passes
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = count--;
        }

        for(int i=0;i<n;i++){ // Note: for-each loop can't be used to modify array's elements
            arr[i] *= (-1);
        }

        System.out.print("New Formed Array : ");
        printArray(arr);

    }
}
