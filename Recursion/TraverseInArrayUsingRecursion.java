package Recursion;

public class TraverseInArrayUsingRecursion {

    // Recursive Code
    public static void printArray(int[] arr, int i){
        if(i==arr.length) return; // base case
        System.out.print(arr[i]+" ");
        printArray(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7,9,0,1,6,3};
//        // Iterative code
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();

        printArray(arr,0);



    }
}
