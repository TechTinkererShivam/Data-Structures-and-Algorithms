package ArraysAndArrayLists;

/* Ques. Next Greater Element -> By using Stacks */

//import java.util.*;

public class NextGreatestElement {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,78,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];

        // // Method I : Brute Force Approach
        // for(int i=0 ; i < n-1 ; i++){
        //     int mx=Integer.MIN_VALUE;
        //     for(int j=i+1 ; j < n ; j++){
        //         if(arr[j] > mx) mx=arr[j];
        //     }
        //     ans[i]=mx;
        // }
        // ans[n-1] = -1;


        // Method II : Optimised Approach
        int nge=arr[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        ans[n-1]= -1;

        printArray(arr);
        System.out.println();
        printArray(ans);
    }
}
