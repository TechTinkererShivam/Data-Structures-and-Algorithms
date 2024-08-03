package ArraysAndArrayLists;

import java.util.*;

public class TwoSum {

    public static void inputArray(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int x = sc.nextInt();
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        inputArray(arr, n);
        printArray(arr);
        sc.close();

        // Two Sum Code
        boolean flag = false;
        for(int i=0 ; i < arr.length ; i++){
            for(int j=i+1 ; j < arr.length ; j++){
                if(arr[i]+arr[j] == x){
                    flag = true;
                    if(flag == true) System.out.println("The sum of the numbers at indices ("+i+","+j+") is "+x);
                    break;
                } 
            }
            //if(flag==true) break;
        }

        if(flag == false) System.out.println("Numbers doesn't exist!");
        
    }
}
